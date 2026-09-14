import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class NameValidationTest {

    @Test
    public void validTypicalName() {
        assertDoesNotThrow(() -> gradebook.validateName("Ali Khan"));
    }

    @Test
    public void emptyName() {
        assertThrows(
            IllegalArgumentException.class,
            () -> gradebook.validateName("")
        );
    }

    @Test
    public void overLengthName() {
        String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXY";
        
        assertThrows(
            IllegalArgumentException.class,
            () -> gradebook.validateName(name)
        );
    }

    @Test
    public void nameWithDigits() {
        assertThrows(
            IllegalArgumentException.class,
            () -> gradebook.validateName("Ali123")
        );
    }
}