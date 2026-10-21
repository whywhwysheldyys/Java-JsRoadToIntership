package second_practice.basics01.methods.practiceMain;

import second_practice.basics01.methods.practice.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(3, 4));
        System.out.println(calculator.add(5.6, 12.5));
        System.out.println(calculator.add(new int[] {1, 2, 3, 4}));
    }
}