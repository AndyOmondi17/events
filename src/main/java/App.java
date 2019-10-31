import dao.Sql2obookingDao;
import dao.bookingsDao;
import models.Bookings;
import org.sql2o.Sql2o;
import spark.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.route.HttpMethod.get;

public class App {

    public static void main(String[] args){

        Map<String,Object> model = new HashMap<>();

//        get("/",(request, response) ->{
//            List<Bookings> allBookings = bookingsDao.getAll();
//            model.put("bookings",allBookings);
//            return new ModelAndView("index.hbs");
//        }, new HandlebarsTemplateEngine());


    }

}
