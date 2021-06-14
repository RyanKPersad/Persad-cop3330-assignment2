package Assignment2.Ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {

    @Test
    void validate_name_if_there_are_mistakes() {
        TestInput VI= new TestInput();
        int expected = VI.Validate_name("g");
        int actual = 2;
        assertEquals(expected,actual);
    }
    @Test
    void validate_name_if_there_are_no_mistakes() {
        TestInput VI= new TestInput();
        int expected = VI.Validate_name("george");
        int actual = 1;
        assertEquals(expected,actual);
    }

    @Test
    void validate_lastname_if_there_are_mistakes() {
        TestInput VI= new TestInput();
        int expected = VI.Validate_lastname("D");
        int actual = 2;
        assertEquals(expected,actual);
    }

    @Test
    void validate_lastname_if_there_are_no_mistakes() {
        TestInput VI= new TestInput();
        int expected = VI.Validate_lastname("Smith");
        int actual = 1;
        assertEquals(expected,actual);
    }

    @Test
    void validate_ID_if_no_mistakes() {
        TestInput VI= new TestInput();
        //Input
        int expected = VI.Validate_ID("AA-1234");
        //Output
        int actual = 1;
        assertEquals(expected,actual);
    }
    @Test
    void validate_ID_if_there_are_mistakes() {
        TestInput VI= new TestInput();
        //Input
        int expected = VI.Validate_ID("AAA-1234");
        //Output
        int actual = 2;
        assertEquals(expected,actual);
    }
}