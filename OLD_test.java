package tests;

import mfa_authentication.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthenticationMethodTest {

    @Test
    void testPasswordAuthSuccess() {
        User user = new User("Alice", "securepassword", new PasswordAuth());
        assertTrue(user.authenticate());
    }

    @Test
    void testPasswordAuthFail() {
        User user = new User("Alice", "wrongpassword", new PasswordAuth());
        assertFalse(user.authenticate());
    }

    @Test
    void testSMSAuth() {
        User user = new User("Alice", "securepassword", new SMSAuth());
        assertTrue(user.authenticate()); // Simulated success
    }

    @Test
    void testAppAuth() {
        User user = new User("Alice", "securepassword", new AppAuth());
        assertTrue(user.authenticate()); // Simulated success
    }
}

