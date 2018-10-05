import java.util.ArrayList;
import java.util.List;

public class Squad {
    private List<Object> newHero = new ArrayList<Object>();
    public Squad(){

    }
    public  void addToSquad(Hero hero){

        newHero.add(hero);
    }
}
