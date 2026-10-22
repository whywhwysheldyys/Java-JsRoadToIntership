package second_practice.advanced03.basics01.arrays.practiceMain;

import second_practice.advanced03.basics01.arrays.practice.ArrayAnalyzer;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = {5 ,2, 9, 1, 7};

        System.out.println(ArrayAnalyzer.findMax(arr));
        System.out.println(ArrayAnalyzer.calculateAverage(arr));
        ArrayAnalyzer.reverseInPlace(arr);
    }
}