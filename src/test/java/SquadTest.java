import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest{
  @Test
    public void squad_addNewHeroToSquad_Hero(){
        Squad topOnes = new Squad();
        Hero superman = new Hero("superman", 34, "punch", "himself", 9, 10);
        topOnes.addToSquad(superman);
        assertTrue(topOnes.squadall.contains(superman));
    }
}