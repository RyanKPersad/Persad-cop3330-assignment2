package Assignment2.Ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void find_anagram_if_true1() {

        Anagram anagram = new Anagram();

        //when
        Boolean expected = true;
        Boolean actual = anagram.find_anagram("note","tone");

        //then
        assertTrue(actual);
    }

    @Test
    void find_anagram_false1() {

        Anagram anagram = new Anagram();

        //when
        Boolean expected = false;
        Boolean actual = anagram.find_anagram("george","dog");

        //then
       assertFalse(actual);
    }

    @Test
    void find_anagram_if_true2() {

        Anagram anagram = new Anagram();

        //when
        Boolean expected = true;
        Boolean actual = anagram.find_anagram("listen","silent");

        //then
        assertTrue(actual);
    }

    @Test
    void find_anagram_if_false2() {

        Anagram anagram = new Anagram();

        //when
        Boolean expected = false;
        Boolean actual = anagram.find_anagram("toy","boy");

        //then
        assertFalse(actual);
    }

}