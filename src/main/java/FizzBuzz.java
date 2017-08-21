public class FizzBuzz {
    public static String fizzbuzz(int n) {
        if (!(1 <= n && n <= 100)) {
            return "";
        }

        if (n % 15 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        return "" + n;
    }
}