import static  org.junit.Assert.*;
import org.junit.Test;

public class HeroTest {
    Hero superman = new Hero("superman", 105, "lazereye", "ladies",8, 9);
    
    @Test
    public void hero_returnsInstancObject_Object(){
        assertEquals(true, superman instanceof Object);
    }

    @Test
    public void hero_checkWhetherHeroHasName_String(){
        assertEquals("superman", superman.getName());
    }

    @Test
    public void hero_checkWhetherHeroHasPower_string(){
        assertEquals("lazereye", superman.getPower());
    }
    @Test
    public void hero_checkWhetherHeroHasAge_Integer(){
        Integer age = 105;
        assertEquals(age, superman.getAge());
    }
}
