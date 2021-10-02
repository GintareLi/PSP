package Tests;

import Validators.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailTester {
    Email email;
    @BeforeEach
    void setUp() {
        email = new Email("glideikaite@yahoo.com");//sito nebuvo
    }

    @Test
    void CheckIfValid_IsNotNull_True(){assertTrue((email.CheckIfValid()));}
    @Test
    void atSymbol_HasAtSymbol_True() {
        assertTrue(email.hasAtSymbol());
    }
    @Test
    void badSymbols_HasNotAllowedSymbols_False() {
        assertFalse(email.hasNotAllowedSymbols());
    }
    @Test
    void correctDomain_HasCorrectDomainAndTLD_True() {
        assertTrue(email.hasCorrectDomainAndTLD());
    }

}