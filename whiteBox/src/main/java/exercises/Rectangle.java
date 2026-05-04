package exercises;

public class Rectangle {

    public static double perimeter(double a, double b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return 2 * (a + b);
    }

    public static double area(double a, double b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return a * b;
    }
}