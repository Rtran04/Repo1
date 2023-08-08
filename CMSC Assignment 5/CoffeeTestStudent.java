import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeTestStudent {
    private Coffee coffee;

    @BeforeEach
    public void setUp() {
        // Initialize a sample Coffee object before each test
        coffee = new Coffee("Test Coffee", Size.LARGE, true, false);
    }

    @Test
    public void testGetExtraShot() {
        Assertions.assertTrue(coffee.getExtraShot());
    }

    @Test
    public void testGetExtraSyrup() {
        Assertions.assertFalse(coffee.getExtraSyrup());
    }

    @Test
    public void testCalcPrice() {
        // Base price + Size price + Shot cost
        double expectedPrice = 2.0 + 2 * 1.0 + 0.5;
        Assertions.assertEquals(expectedPrice, coffee.calcPrice(), 0.001);
    }

    @Test
    public void testGetShotCost() {
        Assertions.assertEquals(0.5, coffee.getShotCost(), 0.001);
    }

    @Test
    public void testGetSyrupCost() {
        Assertions.assertEquals(0.5, coffee.getSyrupCost(), 0.001);
    }

    @Test
    public void testSetExtraShot() {
        coffee.setExtraShot(false);
        Assertions.assertFalse(coffee.getExtraShot());
    }

    @Test
    public void testSetExtraSyrup() {
        coffee.setExtraSyrup(true);
        Assertions.assertTrue(coffee.getExtraSyrup());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Test Coffee, LARGE Extra shot, $4.5", coffee.toString());
    }

    @Test
    public void testEquals() {
        Coffee sameCoffee = new Coffee("Test Coffee", Size.LARGE, true, false);
        Assertions.assertTrue(coffee.equals(sameCoffee));

        Coffee differentCoffee = new Coffee("Different Coffee", Size.MEDIUM, false, true);
        Assertions.assertFalse(coffee.equals(differentCoffee));
    }
}
