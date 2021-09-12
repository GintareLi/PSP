package Phone;

import email.EmailValidator;
import org.junit.jupiter.api.Test;

import static groovy.test.GroovyTestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneValidatorTest {

    PhoneValidator phoneValidator;

    void setUp() {
        phoneValidator = new PhoneValidator();
    }

    @Test
    void TestCheckNumbers() {
        assertTrue(phoneValidator.CheckNumbers("865260442"));

    }

    @Test
    void TestCheckPrefix() {
        assertEquals("+37065260442", phoneValidator.CheckPrefix("865260442"));

    }

    @Test
    void TestCheckCountryPrefix() {
        assertEquals("Number's prefix is correct", phoneValidator.ForeignCountryNr("LT", "+37065260442"));

    }


    @Test
    void TestCheckCountryLength() {
        assertEquals("Number's length is correct", phoneValidator.ForeignCountryNr("LT", "+37065260442"));

    }

}
