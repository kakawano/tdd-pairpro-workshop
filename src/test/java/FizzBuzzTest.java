import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz_when_passed_multiples_of_3() {
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.fizzbuzz(6));
        assertEquals(expected, FizzBuzz.fizzbuzz(24));
        assertEquals(expected, FizzBuzz.fizzbuzz(99));
    }

    @Test
    public void should_return_Buzz_when_passed_multiples_of_5() {
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.fizzbuzz(5));
        assertEquals(expected, FizzBuzz.fizzbuzz(35));
        assertEquals(expected, FizzBuzz.fizzbuzz(100));
    }

    @Test
    public void should_return_FizzBuzz_when_passed_multiples_of_15() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.fizzbuzz(15));
        assertEquals(expected, FizzBuzz.fizzbuzz(30));
        assertEquals(expected, FizzBuzz.fizzbuzz(90));
    }

    @Test
    public void should_return_empty_string_when_passed_lower_than_1() {
        String expected = "";
        assertEquals(expected, FizzBuzz.fizzbuzz(0));
        assertEquals(expected, FizzBuzz.fizzbuzz(-3));
        assertEquals(expected, FizzBuzz.fizzbuzz(-50));
        assertEquals(expected, FizzBuzz.fizzbuzz(-60));
    }

    @Test
    public void should_return_empty_string_when_passed_upper_than_100() {
        String expected = "";
        assertEquals(expected, FizzBuzz.fizzbuzz(101));
        assertEquals(expected, FizzBuzz.fizzbuzz(102));
        assertEquals(expected, FizzBuzz.fizzbuzz(105));
        assertEquals(expected, FizzBuzz.fizzbuzz(110));
    }

    @Test
    public void should_return_input_number_when_passed_other_than_multiples_of_3and5and15() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("79", FizzBuzz.fizzbuzz(79));
    }
}