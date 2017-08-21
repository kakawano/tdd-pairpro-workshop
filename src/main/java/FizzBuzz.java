public class FizzBuzz {
    public static String fizzbuzz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }

        return "" + n;
    }
}