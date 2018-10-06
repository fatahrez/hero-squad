import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest{
  @Test
    public void squad_addNewHeroToSquad_Object(){
        Squad topOnes = new Squad();
        Hero superman = new Hero("superman", 34, "punch", "himself", 9, 10);
        topOnes.addToSquad(superman);
        assertTrue(topOnes.squadall.contains(superman));
    }
  @Test(expected = IllegalArgumentException.class)
    public void squad_setMaximumSize_Object(){
      Squad topOnes = new Squad();

      Hero superman = new Hero("superman", 34, "punch", "himself", 9, 10);
      Hero superwoman = new Hero("superwoamn", 31, "kick", "too slow", 7, 10);
      Hero spiderman = new Hero("spider", 19, "web", "superwoman", 7, 10);
      Hero batman = new Hero("batman", 39, "bats", "himself", 9, 10);
      Hero batlady = new Hero("batlady", 26, "sleeping", "being awake", 5, 10);
      Hero fertah = new Hero("superman", 34, "punch", "himself", 9, 10);
      Hero you = new Hero("df", 98, "power", "weakness", 9, 10);

      topOnes.addToSquad(superman);
      topOnes.addToSquad(superwoman);
      topOnes.addToSquad(spiderman);
      topOnes.addToSquad(batman);
      topOnes.addToSquad(batlady);
      topOnes.addToSquad(fertah);
      topOnes.addToSquad(you);
    }
}