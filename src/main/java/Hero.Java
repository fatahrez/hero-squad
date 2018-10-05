import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private List<Object> instances = new ArrayList <Object>();

  public Hero(String name,int age, String power, String weakness){
    name = mName;
    age = mAge;
    power = mPower;
    weakness = mWeakness;
    instances.add(this);
  }


}