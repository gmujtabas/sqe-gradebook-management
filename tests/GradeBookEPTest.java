import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class GradeBookEPTest {

    @Test
    public void testFClass() {
        assertEquals('F', gradebook.letterGrade(45));
    }

    @Test
    public void testDClass() {
        assertEquals('D', gradebook.letterGrade(65));
    }

    @Test
    public void testCClass() {
        assertEquals('C', gradebook.letterGrade(75));
    }

    @Test
    public void testBClass() {
        assertEquals('B', gradebook.letterGrade(85));
    }

    @Test
    public void testAClass() {
        assertEquals('A', gradebook.letterGrade(95));
    }

    @Test
    public void testInvalidLowClass() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradebook.letterGrade(-10);
        });
    }

    @Test
    public void testInvalidHighClass() {
        assertThrows(IllegalArgumentException.class, () -> {
            gradebook.letterGrade(150);
        });
    }
}
