import model.Amateur;
import model.Competiteur;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParticipantTest {

    @Test
    public void testAmateur() {
        Amateur amateur = new Amateur("TestAmateur", 10);
        assertEquals("TestAmateur", amateur.getNom());
        assertEquals(10, amateur.getScore());

        amateur.setScore(15);
        assertEquals(15, amateur.getScore());

        assertEquals("Amateur{Nom='TestAmateur', Score=15}", amateur.toString());
    }

    @Test
    public void testCompetiteur() {
        Competiteur competiteur = new Competiteur("TestCompetiteur", 20);
        assertEquals("TestCompetiteur", competiteur.getNom());
        assertEquals(20, competiteur.getScore());

        competiteur.setScore(25);
        assertEquals(25, competiteur.getScore());

        assertEquals("Competiteur{nom='TestCompetiteur', score=25, classement=0}", competiteur.toString());
    }
}
