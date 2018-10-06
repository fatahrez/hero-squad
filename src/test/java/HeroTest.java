import static  org.junit.Assert.*;

import java.util.jar.Attributes.Name;

import org.junit.Test;

public class HeroTest {
    Hero superman = new Hero("superman", 105, "lazereye", "ladies",8, 9);
    
    @Test
    public void hero_returnsInstancObject_Object(){
        assertEquals(true, superman instanceof Object);
    }

    @Test
    public void hero_checkWhetherHeroHasName_Object(){
        Hero superman = new Hero("superman", 105, "lazereye", "ladies",8, 9);
        assertEquals("superman", superman.getName());
    }
    
}
