import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeTestStudent {

    @Test
    public void testTypeEnumValues() {
        // Test the enum values
        Type coffeeType = Type.COFFEE;
        Type smoothieType = Type.SMOOTHIE;
        Type alcoholType = Type.ALCOHOL;

        // Ensure the enum values are not null
        Assertions.assertNotNull(coffeeType);
        Assertions.assertNotNull(smoothieType);
        Assertions.assertNotNull(alcoholType);

        // Ensure the enum values are not the same
        Assertions.assertNotEquals(coffeeType, smoothieType);
        Assertions.assertNotEquals(coffeeType, alcoholType);
        Assertions.assertNotEquals(smoothieType, alcoholType);

        // Ensure the enum values are of the correct type
        Assertions.assertTrue(coffeeType instanceof Type);
        Assertions.assertTrue(smoothieType instanceof Type);
        Assertions.assertTrue(alcoholType instanceof Type);
    }


}
