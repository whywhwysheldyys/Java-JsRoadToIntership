package second_practice.advanced03.oop02.staticword.practice;

public class MathUtils {
    public static final double PI = 3.14159;

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка!Введите число больше 0");
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private MathUtils() {};
}