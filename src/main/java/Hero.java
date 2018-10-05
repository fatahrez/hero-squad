import java.util.ArrayList;
import java.util.List;

public class Hero{
    private String mName;
    private Integer mAge;
    private String mPower;
    private String mWeakness;
    private Integer mDefense;
    private Integer mDistanceAttack;
    public static int number;

    public Hero(String name,Integer age, String power, String weakness, Integer defense, Integer distanceAttack){
        name = this.mName;
        age = this.mAge;
        power = this.mPower;
        weakness = this.mWeakness;
        defense = this.mDefense;
        distanceAttack = this.mDistanceAttack;
        getTotal();
    }
    public static int getTotal(){
        return number;
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