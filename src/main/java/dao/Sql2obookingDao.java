package dao;

import model.Bookings;
import model.Events;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;
import org.sql2o.Sql2o;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Sql2obookingDao implements bookingsDao {
    private final Sql2o sql2o;

    public Sql2obookingDao(Sql2o sql2o) { this.sql2o = sql2o; }
//    LIST
    @Override
    public List<Bookings> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM bookings")
                    .executeAndFetch(Bookings.class);
        }
    }
//    Update
    @Override
    public void update (int id,int payment) {
        String sql = "UPDATE bookings SET payment = :payment WHERE id = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("payment", payment)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }
    //    Delete
    @Override
    public void deleteById(int id) {
        String sql = "DELETE from bookings WHERE id=:id"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllBookings() {
        String sql = "DELETE from bookings"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void add(Bookings bookings) {
        String sql = "INSERT INTO bookings (payment) VALUES (:payment)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(bookings)
                    .executeUpdate()
                    .getKey();
            bookings.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Events> getAllEventsByBookings(int event_id){
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM events_table WHERE events_id = :events_id")
                    .addParameter("event_id", event_id)
                    .executeAndFetch(Events.class);
        }
    }

    @Override
    public Bookings findById(int id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM booking WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Bookings.class);
        }
    }

}
