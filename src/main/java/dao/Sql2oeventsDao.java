package dao;

import model.Bookings;
import model.Events;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Sql2oeventsDao implements eventsDao {
    private final Sql2o sql2o;

    public Sql2oeventsDao(Sql2o sql2o) { this.sql2o = sql2o; }

    @Override
    public List<Events> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM events_table")
                    .executeAndFetch(Events.class);
        }
    }
//CREATE TABLE events_table(
//    id SERIAL PRIMARY KEY,
//    event_name VARCHAR,
//    event_description VARCHAR,
//    event_date DATE,
//    event_location VARCHAR,
//    event_poster BYTEA,
//    event_startTime TIME,
//    event_endTime TIME,
//    category_type VARCHAR
//);

    @Override
    public void add(Events events) {
        String sql = "INSERT INTO events_table (eventname,eventdescription,eventlocation,eventdate,starttime,endtime,eventposter) VALUES (:eventName,:eventDescription,:eventDate,:startTime,:endTime,:eventLocation,:eventPoster)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(events)
                    .executeUpdate()
                    .getKey();
            events.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
    @Override
        public Events findById(int id) {
            try (Connection con = sql2o.open()) {
                return con.createQuery("SELECT * FROM events_table WHERE id = :id")
                        .addParameter("id", id)
                        .executeAndFetchFirst(Events.class);
            }
        }

//         private String eventName;
//    private String eventLocation;
//    private String description;
//    private Date eventDate;
//    private LocalTime startTime;
//    private LocalTime endTime;
//    private int price;
//    private BufferedImage eventPoster;

    @Override
    public void update(int id, String eventName, String eventLocation, Date eventDate, LocalTime startTime,LocalTime endTime,int price, File eventPoster) {
        String sql = "UPDATE events_table SET events_name = :events_name WHERE id = :id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("eventName", eventName)
                    .addParameter("eventLocation", eventLocation)
                    .addParameter("eventDate", eventDate)
                    .addParameter("startTime", startTime)
                    .addParameter("endTime", endTime)
                    .addParameter("price", price)
                    .addParameter("eventPoster", eventPoster)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }

    //DELETE
    @Override
    public void deleteById(int id) {
        String sql = "DELETE from events_table WHERE id=:id"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllEvents() {
        String sql = "DELETE from events_table"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Bookings> getAllBookingsByEvents(int event_id){
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM bookings WHERE events_id = :events_id")
                    .addParameter("event_id", event_id)
                    .executeAndFetch(Bookings.class);
        }
    }

}
