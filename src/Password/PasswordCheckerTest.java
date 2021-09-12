package Password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    PasswordChecker passwordChecker;

    void setUp() {
        passwordChecker = new PasswordChecker();
    }

    @Test
    void TestChecklength() {
        assertTrue(passwordChecker.CheckLength(5, 4));
    }

    @Test
    void TestCheckUppercase() {
        assertTrue(passwordChecker.CheckUppercase("Slaptazodis"));

    }

    @Test
    void TestCheckSymbols() {
        assertTrue(passwordChecker.CheckSymbols("Slaptazodis"));

    }

}
