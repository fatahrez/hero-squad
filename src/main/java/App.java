import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String [] args){
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return modelAndView (model, layout);
        }, new VelocityTemplateEngine());

        get("hero/new", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int  defense = Integer.parseInt(request.queryParams("defense"));
            int  distanceAttack = Integer.parseInt(request.queryParams("distanceAttack"));

            Hero myHero = new Hero(name, age, power, weakness, defense, distanceAttack);
            model.put("myHero", myHero);

            model.put("template", "templates/hero-form.vtl");
            return modelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/hero", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            // String name = request.queryParams("name");
            // int age = Integer.parseInt(request.queryParams("age"));
            // String power = request.queryParams("power");
            // String weakness = request.queryParams("weakness");
            // int  defense = Integer.parseInt(request.queryParams("defense"));
            // int  distanceAttack = Integer.parseInt(request.queryParams("distanceAttack"));

            // Hero myHero = new Hero(name, age, power, weakness, defense, distanceAttack);
            // model.put("myHero", myHero);

            model.put("template", "templates/hero.vtl");
            return modelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }
}
