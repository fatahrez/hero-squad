import java.util.ArrayList;
import java.util.List;


public class Squad {
    List<Object> squadall=null;
    public Squad(){
         squadall= new ArrayList <Object>();
    }
    public void addToSquad(Hero newHero){
        squadall.add(newHero);
    }
}
