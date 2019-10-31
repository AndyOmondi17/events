package dao;

import models.Bookings;
import models.Customer;
import models.Events;

import java.awt.image.BufferedImage;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public interface eventsDao {
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
    //LIST
    List<Events>getAll();
//    CREATE
    void add(Events events);

//    READ
    Events findById(int id);
//    List<Customer>getAllCustomersByEvents(int event_id);
    List<Bookings>getAllBookingsByEvents(int event_id);
//    UPDATE
    void update(int id, String eventName, String eventLocation, Date eventDate, LocalTime startTime,LocalTime endTime,int price, BufferedImage eventPoster);
    //  DELETE
    void deleteById(int id);
    void clearAllEvents();
}
