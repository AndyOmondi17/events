package dao;

import model.Bookings;
import model.Customer;
import model.Events;

import java.util.List;

public interface bookingsDao {
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
//    LIST
     List<Bookings> getAll();

//    CREATE
    void add(Bookings bookings);
//    READ
    Bookings findById(int id);
//    List<Customer> getAllCustomersByBookings(int booking_id);
    List<Events> getAllEventsByBookings(int booking_id);
//    UPDATE
    void update(int id, int payment);
//    DELETE
    void deleteById(int id);
    void clearAllBookings();
}
