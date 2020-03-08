package checkxo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    @Test
    void test1() {
        //given
        String input = "xxxooo";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test2() {
        //given
        String input = "xxooo";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertFalse(result);
    }

    @Test
    void test3() {
        //given
        String input = "abcdxxabcdoo";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test4() {
        //given
        String input = "fhxsgvsfgsxx";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertFalse(result);
    }

    @Test
    void test5() {
        //given
        String input = "abcd";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test6() {
        //given
        String input = "OOOXXX";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test7() {
        //given
        String input = "OXOXO";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertFalse(result);
    }

    @Test
    void test8() {
        //given
        String input = "ABCD";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test9() {
        //given
        String input = "";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

    @Test
    void test10() {
        //given
        String input = "xxxOOO";
        //when
        boolean result = CharCounter.checkXO(input);
        //then
        assertTrue(result);
    }

}