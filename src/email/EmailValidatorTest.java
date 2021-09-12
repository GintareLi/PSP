package email;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    EmailValidator emailValidator;

    void setUp() {
        emailValidator = new EmailValidator();
    }

    @Test
    void TestCheckEta() {
        assertTrue(emailValidator.CheckEta("Glideikaite@yahoo.com"));

    }

    @Test
    void TestCheckSymbols() {
        assertTrue(emailValidator.CheckSymbols("Glideikaite@yahoo.com"));

    }

    @Test
    void TestCheckDomenAndTLD() {
        assertTrue(emailValidator.CheckDomainAndTLD("Glideikaite@yahoo.com"));

    }


}
