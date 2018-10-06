import java.util.ArrayList;
import java.util.List;

public class Squad {
    List<Object> squadall = null;
    public Squad(){
        squadall = new ArrayList<Object>();
    }
    public void addToSquad(Hero newHero){
        if(squadall.size() > 5){
            throw new IllegalArgumentException("maximum size is 5");
        }
        else if(squadall.size() < 6){
            squadall.add(newHero);
        }
    }
}
