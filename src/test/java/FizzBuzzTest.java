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
}