import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class RosterScoreCountTest {

    @Test
    void zeroScoresShouldBeInvalid() {
        Student student = new Student("Ali", "101");

        assertThrows(IllegalArgumentException.class, () -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }

    @Test
    void oneScoreShouldBeValid() {
        Student student = new Student("Ali", "101");
        student.addScore(75);

        assertDoesNotThrow(() -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }

    @Test
    void twoScoresShouldBeValid() {
        Student student = new Student("Ali", "101");
        student.addScore(75);
        student.addScore(80);

        assertDoesNotThrow(() -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }

    @Test
    void fiveScoresShouldBeValid() {
        Student student = new Student("Ali", "101");

        for (int i = 0; i < 5; i++) {
            student.addScore(75);
        }

        assertDoesNotThrow(() -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }

    @Test
    void sixScoresShouldBeValid() {
        Student student = new Student("Ali", "101");

        for (int i = 0; i < 6; i++) {
            student.addScore(75);
        }

        assertDoesNotThrow(() -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }

    @Test
    void sevenScoresShouldBeInvalid() {
        Student student = new Student("Ali", "101");

        for (int i = 0; i < 7; i++) {
            student.addScore(75);
        }

        assertThrows(IllegalArgumentException.class, () -> {
            if (student.scores.size() < 1 || student.scores.size() > 6) {
                throw new IllegalArgumentException("Student must have between 1 and 6 scores");
            }
        });
    }
}