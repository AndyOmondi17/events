import dao.Sql2oeventsDao;
import model.Events;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        Sql2oeventsDao eventsDao;
        Connection conn;
        String connectionString = "jdbc:postgresql://localhost:5432/events";
        Sql2o sql2o = new Sql2o(connectionString, "sonnie", "DBpassword");
        eventsDao = new Sql2oeventsDao(sql2o);
        conn = sql2o.open();


        //Dispalys the homepage
        get("/", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }), new HandlebarsTemplateEngine());

        get("/event", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();

            return new ModelAndView(model, "view-event.hbs");
        }), new HandlebarsTemplateEngine());

        get("/event/new", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "add-event-form.hbs");
        }), new HandlebarsTemplateEngine());

        get("/booked", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "checkout-events.hbs");
        }), new HandlebarsTemplateEngine());

        post("/event/new", ((request, response) ->  {
            Map<String, Object> model = new HashMap<>();
            String eventName = request.params("eventName");
            String eventLocation = request.params("eventLocation");
            String eventDescription = request.params("description");
            Date eventDate = new Date(request.params("eventDate"));
            LocalTime startTime =LocalTime.parse(request.params("startTime"));
            LocalTime endTime = LocalTime.parse(request.params("endTime"));
            int price = Integer.parseInt(request.params("price"));
            File eventPoster = new File(request.params("eventPoster"));
            //String category_name = request.params("category_name");
            Events eventsNew = new Events(eventName, eventLocation,eventDescription,  eventDate,startTime, endTime, price, eventPoster);
            eventsDao.add(eventsNew);
            response.redirect("/");
            return null;
        }), new HandlebarsTemplateEngine());





    }

}
