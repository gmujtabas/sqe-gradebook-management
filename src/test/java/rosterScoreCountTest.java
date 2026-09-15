import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RosterScoreCountTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 7})
    public void testInvalidScoreCount(int scoreCount) {
        Student student = new Student("Ali", "101");

        for (int i = 0; i < scoreCount; i++) {
            student.addScore(75);
        }

        Roster roster = new Roster();

        assertThrows(
            IllegalArgumentException.class,
            () -> roster.addStudent(student)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 6})
    public void testValidScoreCount(int scoreCount) {
        Student student = new Student("Ali", "101");

        for (int i = 0; i < scoreCount; i++) {
            student.addScore(75);
        }

        Roster roster = new Roster();

        assertDoesNotThrow(() -> roster.addStudent(student));
    }
}
