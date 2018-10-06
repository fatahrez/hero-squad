import static  org.junit.Assert.*;
import org.junit.Test;

public class HeroTest {
    Hero superman = new Hero("superman", 105, "lazereye", "ladies",8, 9);
    @Test
    public void hero_returnsInstancObject_Object(){
        assertEquals(true, superman instanceof Object);
    }
    
}
