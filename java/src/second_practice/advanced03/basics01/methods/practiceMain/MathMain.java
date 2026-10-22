package second_practice.advanced03.basics01.methods.practiceMain;

import second_practice.advanced03.basics01.methods.practice.MathOperations;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(MathOperations.calculateSum(1, 4));
        System.out.printf("%.2f\n", MathOperations.calculateSum(3.4, 5.8, 2.7));
        System.out.println(MathOperations.calculateSum(3));
    }
}