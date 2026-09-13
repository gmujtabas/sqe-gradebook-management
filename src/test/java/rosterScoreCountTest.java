import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RosterScoreCountTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 8})
    public void testScoreCount(int scoreCount) {

        Student student = new Student("Ali", "101");

        for (int i = 0; i < scoreCount; i++) {
            student.addScore(75);
        }

        Roster roster = new Roster();

        if (scoreCount == 3) {
            assertDoesNotThrow(() -> roster.addStudent(student));
        } else {
            assertThrows(
                IllegalArgumentException.class,
                () -> roster.addStudent(student)
            );
        }
    }
}
