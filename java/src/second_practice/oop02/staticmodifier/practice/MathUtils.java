package second_practice.oop02.staticmodifier.practice;

public class MathUtils {
    private MathUtils() {};

    public static int add(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * (radius * radius);
    }
}