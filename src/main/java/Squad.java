import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Squad {
    List<Object> squadall = null;
    // List<Object> squadall=null;
    public Squad(){
         squadall= Arrays.asList(new Object[5]) ;
    }
    public void addToSquad(Hero newHero){
            squadall.add(newHero);
    }
}
