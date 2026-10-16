package primitives;

public class Calc {
    public static void printGreeting() {
        System.out.println("Приветствую вас!");
    }

    public static int calcNum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        printGreeting();
        System.out.println(calcNum(5, 6));
    }
}