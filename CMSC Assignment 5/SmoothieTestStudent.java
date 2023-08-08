import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmoothieTestStudent {

    @Test
    public void testSmoothieCalcPrice() {
        // Create a Smoothie object
        Smoothie smoothie = new Smoothie("Tropical Smoothie", Size.MEDIUM, 3, true);

        // Calculate the expected price
        double expectedPrice = 2.0 + 1.0 + 3 * 0.5 + 1.5;

        // Calculate the actual price using calcPrice method
        double actualPrice = smoothie.calcPrice();

        // Verify that the calculated price matches the expected price
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

   

   
}
