import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_passed_1() {
        String expected = "1";
        String actual = FizzBuzz.fizzbuzz(1);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Fizz_when_passed_3() {
        String expected = "Fizz";
        String actual = FizzBuzz.fizzbuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Buzz_when_passed_5() {
        String expected = "Buzz";
        String actual = FizzBuzz.fizzbuzz(5);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_passed_15() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzbuzz(15);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_empty_string_when_passed_lower_than_1() {
        String expected = "";
        String actual = FizzBuzz.fizzbuzz(0);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_empty_string_when_passed_upper_than_100() {
        String expected = "";
        String actual = FizzBuzz.fizzbuzz(101);
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Buzz_when_passed_100() {
        String expected = "Buzz";
        String actual = FizzBuzz.fizzbuzz(100);
        assertEquals(expected, actual);
    }
}