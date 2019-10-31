import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

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



    }

}
