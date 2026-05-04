package exercises;

public class QuadraticEquation {

    public static String solve(double a, double b, double c) {
        if (a == 0)
            return "Not quadratic";

        double delta = b * b - 4 * a * c;

        if (delta < 0)
            return "No solution";
        if (delta == 0)
            return "One solution";
        return "Two solutions";
    }
}