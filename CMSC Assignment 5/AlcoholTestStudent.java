import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlcoholTestStudent {

    private Alcohol alcohol;

    @Before
    public void setUp() {
        alcohol = new Alcohol("Whiskey", Size.MEDIUM, true);
    }

    

    @Test
    public void testEquals() {
        // Test equal objects
        Alcohol alcohol2 = new Alcohol("Whiskey", Size.MEDIUM, true);
        assertTrue(alcohol.equals(alcohol2));

        // Test unequal objects
        Alcohol alcohol3 = new Alcohol("Rum", Size.MEDIUM, true);
        assertFalse(alcohol.equals(alcohol3));
    }

    @Test
    public void testGetWeekendFee() {
        assertEquals(0.6, alcohol.getWeekendFee(), 0.001);
    }

    
}
