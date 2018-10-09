import java.util.ArrayList;
import java.util.List;
public class Hero{
    private String mName;
    private Integer mAge;
    private String mPower;
    private String mWeakness;
    private Integer mDefense;
    private Integer mDistanceAttack;
    public static List<Hero> instances = new ArrayList<Hero>();
    private int mId;

    public Hero(String name,Integer age, String power, String weakness, Integer defense, Integer distanceAttack){
        mName = name;
        mAge = age;
        mPower = power;
        mWeakness = weakness;
        mDefense = defense;
        mDistanceAttack = distanceAttack;
        instances.add(this);
        mId = instances.size();
    }
    public static List<Hero> all(){

        return instances;
    }

    public int getId(){
        return mId;
    }
    public static Hero find(int id){

        return instances.get(id -1);
    }
    public String getName(){

        return mName;
    }
    public Integer getAge(){
        return mAge;
    }
    public String getPower(){
        return mPower;
    }
    public String getWeakness(){

        return mWeakness;
    }
    public Integer getDefense(){

        return mDefense;
    }
    public Integer getDistanceAttack(){

        return mDistanceAttack;
    }
}