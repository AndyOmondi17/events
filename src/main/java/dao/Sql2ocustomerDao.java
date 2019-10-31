package dao;

import models.Bookings;
import models.Customer;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2ocustomerDao implements customerDao {
    private final Sql2o sql2o;

    public Sql2ocustomerDao(Sql2o sql2o) { this.sql2o = sql2o; }
    //LIST
    @Override
    public List<Customer> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM customer")
                    .executeAndFetch(Customer.class);
        }
    }

    //Update
    @Override
    public void update (int id,String customerName) {
        String sql = "UPDATE customer SET customerName = :customerName WHERE id = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("customerName", customerName)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }

    //delete
    @Override
    public void deleteById(int id) {
        String sql = "DELETE from customer WHERE id=:id"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllCustomers() {
        String sql = "DELETE from customer"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }


    @Override
    public Customer findById(int id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM customer WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Customer.class);
        }
    }

    @Override
    public void add(Customer customer) {
        String sql = "INSERT INTO customer (customer) VALUES (:customer)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(customer)
                    .executeUpdate()
                    .getKey();
            customer.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

}
