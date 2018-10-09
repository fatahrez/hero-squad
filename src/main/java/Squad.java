import java.util.ArrayList;
import java.util.List;

public class Squad {
    public List<Hero> squadall;
    private String mName;
    private String mHeroismCause;
    private int mId;
    private static List<Squad> instances = new ArrayList<Squad>();

    // public Squad(String name, String heroismCause) {
    //     mName = name;
    //     mHeroismCause = heroismCause;
    //     instances.add(this);
    //     mId = instances.size();
    //     squadall = new ArrayList<Hero>();
    // }
    public Squad() {
        // mName = name;
        // mHeroismCause = heroismCause;
        // instances.add(this);
        // mId = instances.size();
        squadall = new ArrayList<Hero>();
    }
    public void addToSquad(Hero newHero){
        if(squadall.size() > 5){
            throw new IllegalArgumentException("maximum size is 5");
        }
        else if(squadall.size() < 6){
            squadall.add(newHero);
        }
    }
    public static List<Squad> all(){
        return instances;
    }
    public String getName(){
        return mName;
    }
    public String getHeroismCause(){
        return mHeroismCause;
    }
    public List<Hero> theSquad(){
        return squadall;
    }
    public static Squad find(int id){
        return instances.get(id - 1);
    }
}