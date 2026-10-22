package second_practice.advanced03.basics01.variables.practiceMain;

import java.util.Scanner;

public class OverflowAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свое число: ");
        int originalValue = input.nextInt();

        short originalValueShort = (short) originalValue;
        byte originalValueByte = (byte) originalValue; //если введеное число > 127 - будет переполнение тк выходит за диапазон byte

        System.out.println("Исходное введеное число: " + originalValue + "\n"
                            + "Результат приведения к short: " + originalValueShort + "\n"
                            + "Результат приведения к byte: " + originalValueByte + "\n");
    }
}