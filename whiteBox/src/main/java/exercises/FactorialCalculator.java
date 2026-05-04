package exercises;

public class FactorialCalculator {

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static int sumFactorial(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}