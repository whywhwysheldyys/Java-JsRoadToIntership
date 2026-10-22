package second_practice.advanced03.basics01.methods.practice;

public class MathOperations {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static double calculateSum(double a, double b, double c) {
        return a + b + c;
    }

    public static int calculateSum(int... numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }
}