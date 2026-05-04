package exercises;

public class SumCalculator {

    // S = 1 - 2 + 3 - 4 + ... + n
    public static int sumAlternating(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0) ? -i : i;
        }
        return sum;
    }
}