import model.Competition;
import model.Competiteur;
import model.Amateur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompetitionTest {

    private Competition competition;

    @Before
    public void setUp() {
        competition = new Competition();

        competition.ajouterCompetiteur(new Competiteur("Mark Zukerberg", 20));
        competition.ajouterCompetiteur(new Competiteur("Paul", 15));
        competition.ajouterCompetiteur(new Competiteur("Patrick Bateman", 25));
        competition.ajouterCompetiteur(new Competiteur("Frank", 10));

        competition.ajouterAmateur(new Amateur("Hawkin", 5));
        competition.ajouterAmateur(new Amateur("Macron", 8));
        competition.ajouterAmateur(new Amateur("Fabrice Eboue", 12));
        competition.ajouterAmateur(new Amateur("Hulk", 3));
    }

    @Test
    public void testAjoutEtClassementCompetiteurs() {
        competition.mettreAJourClassement();
        Competiteur premier = competition.getCompetiteurs().first();

        assertEquals("Patrick Bateman", premier.getNom());
        assertEquals(25, premier.getScore());
        assertEquals(1, premier.getClassement());

        Competiteur dernier = competition.getCompetiteurs().last();
        assertEquals("Frank", dernier.getNom());
        assertEquals(10, dernier.getScore());
        assertEquals(4, dernier.getClassement());
    }

    @Test
    public void testAjoutAmateurs() {
        assertEquals(4, competition.getAmateurs().size());
        assertNotNull(competition.getAmateur("Hawkin"));
        assertNull(competition.getAmateur("NonExistant"));
    }
}
