import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayTestStudent {

    @Test
    public void testEnumValues() {
        // Test that all enum values are defined correctly
        Assertions.assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
        Assertions.assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
        Assertions.assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
        Assertions.assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
        Assertions.assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
        Assertions.assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
        Assertions.assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
    }

    @Test
    public void testToString() {
        // Test the toString() method of each enum value
        Assertions.assertEquals("SUNDAY", Day.SUNDAY.toString());
        Assertions.assertEquals("MONDAY", Day.MONDAY.toString());
        Assertions.assertEquals("TUESDAY", Day.TUESDAY.toString());
        Assertions.assertEquals("WEDNESDAY", Day.WEDNESDAY.toString());
        Assertions.assertEquals("THURSDAY", Day.THURSDAY.toString());
        Assertions.assertEquals("FRIDAY", Day.FRIDAY.toString());
        Assertions.assertEquals("SATURDAY", Day.SATURDAY.toString());
    }
}
