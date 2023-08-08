import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SizeTestStudent {

    @Test
    public void testSizeEnumValues() {
        // Test the enum values
        Size smallSize = Size.SMALL;
        Size mediumSize = Size.MEDIUM;
        Size largeSize = Size.LARGE;

        // Ensure the enum values are not null
        Assertions.assertNotNull(smallSize);
        Assertions.assertNotNull(mediumSize);
        Assertions.assertNotNull(largeSize);

        // Ensure the enum values are not the same
        Assertions.assertNotEquals(smallSize, mediumSize);
        Assertions.assertNotEquals(smallSize, largeSize);
        Assertions.assertNotEquals(mediumSize, largeSize);

        // Ensure the enum values are of the correct type
        Assertions.assertTrue(smallSize instanceof Size);
        Assertions.assertTrue(mediumSize instanceof Size);
        Assertions.assertTrue(largeSize instanceof Size);
    }

   
}
