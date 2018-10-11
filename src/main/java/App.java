import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String [] args){
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
        setPort(port);

        get("/", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return modelAndView (model, layout);
        }, new VelocityTemplateEngine());

        get("herosquads/:id/heroes/new", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/hero-form.vtl");
            return modelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/heroes", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", Hero.all());
        
            model.put("template", "templates/heroes.vtl");
            return modelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/heroes", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();

            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int  defense = Integer.parseInt(request.queryParams("defense"));
            int  distanceAttack = Integer.parseInt(request.queryParams("distanceAttack"));
            Hero newHero = new Hero(name, age, power, weakness, defense, distanceAttack);

            model.put("template", "templates/success.vtl");
            return modelAndView(model, layout);
        }, new VelocityTemplateEngine());


        get("/heroes/:id", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();
            Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
            model.put("hero", hero);
            model.put("template", "templates/hero.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

        // post("/heroes", (request, response)->{
        //     Map<String, Object> model = new HashMap<String, Object>();

        //     String name = request.queryParams("name");
        //     int age = Integer.parseInt(request.queryParams("age"));
        //     String power = request.queryParams("power");
        //     String weakness = request.queryParams("weakness");
        //     int  defense = Integer.parseInt(request.queryParams("defense"));
        //     int  distanceAttack = Integer.parseInt(request.queryParams("distanceAttack"));
        //     Hero newHero = new Hero(name, age, power, weakness, defense, distanceAttack);

        //     model.put("template", "templates/success.vtl");
        //     return modelAndView(model, layout);
        // }, new VelocityTemplateEngine());

        get("/herosquads/new", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/herosquad-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/herosquads", (request, response)->{
            Map <String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String heroismCause = request.queryParams("heroismCause");
            Squad herosquad = new Squad(name, heroismCause);

            model.put("template", "templates/squad-success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/herosquads", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("herosquads", Squad.all());
            model.put("template", "templates/herosquads.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("/herosquads/:id", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            Squad herosquad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("herosquad", herosquad);
            model.put("template", "templates/herosquad.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());
        get("/herosquads/:id/heroes/new", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(":id"));
            model.put("squad", squad);
            model.put("template", "templates/hero-form.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("/heroes", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(":id"));

            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            int  defense = Integer.parseInt(request.queryParams("defense"));
            int  distanceAttack = Integer.parseInt(request.queryParams("distanceAttack"));
            Hero newHero = new Hero(name, age, power, weakness, defense, distanceAttack);

            squad.addToSquad(newHero);

            model.put("herosquads", squad);
            model.put("template", "templates/squad-success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}