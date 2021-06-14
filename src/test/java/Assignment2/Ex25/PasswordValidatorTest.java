package Assignment2.Ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void check_password_is_VERYweak() {
        PasswordValidator pv = new PasswordValidator();

        int expected = pv.password_strength("12345");
        int actual = 4;

        assertEquals(expected,actual);


    }
    @Test
    void check_password_is_weak() {
        PasswordValidator pv = new PasswordValidator();

        int expected = pv.password_strength("abcdef");
        int actual = 3;

        assertEquals(expected,actual);


    }

    @Test
    void check_password_is_Strong() {
        PasswordValidator pv = new PasswordValidator();

        int expected = pv.password_strength("abc123xyz");
        int actual = 2;

        assertEquals(expected,actual);


    }
    @Test
    void check_password_is_VERYStrong() {
        PasswordValidator pv = new PasswordValidator();

        int expected = pv.password_strength("1337@xor!");
        int actual = 1;

        assertEquals(expected,actual);


    }
}