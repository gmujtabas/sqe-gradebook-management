import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LetterGradeBvaTest {

    @ParameterizedTest
    @CsvSource({
        "0, F",
        "1, F",
        "59, F",
        "60, D",
        "61, D",
        "69, D",
        "70, C",
        "71, C",
        "79, C",
        "80, B",
        "81, B",
        "89, B",
        "90, A",
        "91, A",
        "99, A",
        "100, A"
    })
    void testLetterGradeBoundaries(int score, char expected) {
        assertEquals(expected, gradebook.letterGrade(score));
    }

    @ParameterizedTest
    @CsvSource({
        "-1",
        "101"
    })
    void testInvalidDomainBoundaries(int score) {
        assertThrows(
            IllegalArgumentException.class,
            () -> gradebook.letterGrade(score)
        );
    }
}
