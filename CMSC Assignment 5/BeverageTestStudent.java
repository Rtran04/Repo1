import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeverageTestStudent {
    private Beverage beverage;

    @BeforeEach
    public void setUp() {
        // Initialize a sample Beverage object before each test
        beverage = new TestBeverage("Test Beverage", Type.COFFEE, Size.MEDIUM);
    }

    @Test
    public void testGetBasePrice() {
        Assertions.assertEquals(2.0, beverage.getBasePrice(), 0.001);
    }

    @Test
    public void testGetType() {
        Assertions.assertEquals(Type.COFFEE, beverage.getType());
    }

    @Test
    public void testGetBevName() {
        Assertions.assertEquals("Test Beverage", beverage.getBevName());
    }

    @Test
    public void testGetSize() {
        Assertions.assertEquals(Size.MEDIUM, beverage.getSize());
    }

    @Test
    public void testAddSizePrice() {
        Assertions.assertEquals(1.0, beverage.addSizePrice(), 0.001);
    }

    @Test
    public void testCalcPrice() {
        // Override the abstract method for testing
        double expectedPrice = 2.0 + 1.0; // Base price + Size price
        Assertions.assertEquals(expectedPrice, beverage.calcPrice(), 0.001);
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Test Beverage, MEDIUM", beverage.toString());
    }

    @Test
    public void testEquals() {
        Beverage sameBeverage = new TestBeverage("Test Beverage", Type.COFFEE, Size.MEDIUM);
        Assertions.assertTrue(beverage.equals(sameBeverage));

        Beverage differentBeverage = new TestBeverage("Different Beverage", Type.SMOOTHIE, Size.LARGE);
        Assertions.assertFalse(beverage.equals(differentBeverage));
    }

    // Create a private subclass of Beverage for testing purposes
    private class TestBeverage extends Beverage {
        public TestBeverage(String bevName, Type bevType, Size bevSize) {
            super(bevName, bevType, bevSize);
        }

        @Override
        public double calcPrice() {
            return getBasePrice() + addSizePrice();
        }
    }
}
