package dao;

import model.Bookings;
import model.Customer;
import model.Events;

import java.util.List;

public interface customerDao {

//    CREATE
    void add(Customer customer);

//  LIST
    List<Customer> getAll();

//    READ
    Customer findById(int id);
    List<Events> getAllEventsByCustomer(int customer_id);
    List<Bookings> getAllBookingsByCustomer(int customer_id);
// UPDATE
    void update(int id, String customerName);

//    DELETE
    void deleteById(int id);
    void clearAllCustomers();

}
