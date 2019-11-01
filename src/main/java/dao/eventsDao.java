package dao;

import model.Bookings;
import model.Customer;
import model.Events;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public interface eventsDao {

    //LIST
    List<Events>getAll();
//    CREATE
    void add(Events events);

//    READ
    Events findById(int id);
//    List<Customer>getAllCustomersByEvents(int event_id);
    List<Bookings>getAllBookingsByEvents(int event_id);
//    UPDATE
    void update(int id, String eventName, String eventLocation, Date eventDate, LocalTime startTime, LocalTime endTime, int price, File eventPoster);
    //  DELETE
    void deleteById(int id);
    void clearAllEvents();
}
