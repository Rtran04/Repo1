import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @BeforeEach
    public void setUp() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(80);
        gradeBook1.addScore(90);
        gradeBook1.addScore(75);

        gradeBook2.addScore(85);
        gradeBook2.addScore(95);
        gradeBook2.addScore(70);
    }

    @AfterEach
    public void tearDown() {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void testAddScore() {
        assertEquals("80.0 90.0 75.0", gradeBook1.toString());
        assertEquals("85.0 95.0 70.0", gradeBook2.toString());

        assertEquals(3, gradeBook1.getScoreSize());
        assertEquals(3, gradeBook2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(245.0, gradeBook1.sum(), 0.01);
        assertEquals(250.0, gradeBook2.sum(), 0.01);
    }

    @Test
    public void testMinimum() {
        assertEquals(75.0, gradeBook1.minimum(), 0.01);
        assertEquals(70.0, gradeBook2.minimum(), 0.01);
    }

    @Test
    public void testFinalScore() {
        assertEquals(170.0, gradeBook1.finalScore(), 0.01);
        assertEquals(180.0, gradeBook2.finalScore(), 0.01);
    }
}
