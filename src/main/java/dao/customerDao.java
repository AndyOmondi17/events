package dao;

import models.Bookings;
import models.Customer;
import models.Events;

import java.util.List;

public interface customerDao {
    //LIST
//    List<Sighting> getAll();

    //CREATE
//    void add(Sighting sighting);

    //READ
//    Sighting findById(int id);
//    List<Animal> getAllAnimalsBySighting(int sighting_id);
//    List<EndangeredAnimal> getAllEndangeredAnimalsBySighting(int sighting_id);

    //UPDATE
//    void update(int id, String animal_location, String ranger_name);

    //DELETE
//    void deleteById(int id);
//    void clearAllSightings();

//    CREATE
    void add (Customer customer);

//  LIST
    List<Customer> getAll();

//    READ
    Customer findById(int id);
//    List<Events> getAllEventsByCustomer(int customer_id);
//    List<Bookings> getAllBookingsByCustomer(int customer_id);
// UPDATE
    void update(int id,String customerName);
//    DELETE
    void deleteById(int id);
    void clearAllCustomers();

}
