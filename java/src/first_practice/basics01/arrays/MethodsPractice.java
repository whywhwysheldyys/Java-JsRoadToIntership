package first_practice.basics01.arrays;

public class MethodsPractice {
    public static void printGreeting(String name) {
        System.out.println("Привет - " + name);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        printGreeting("Andrey");
        System.out.println(calculateSum(1, 15));
        System.out.println(multiply(2, 7));
        System.out.println(multiply(3.4, 2.3));
    }
}