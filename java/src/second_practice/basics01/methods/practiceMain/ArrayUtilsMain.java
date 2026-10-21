package second_practice.basics01.methods.practiceMain;

import second_practice.basics01.methods.practice.ArrayUtils;

public class ArrayUtilsMain {
    public static void main(String[] args) {
        ArrayUtils array = new ArrayUtils();

        System.out.println("Максимальный элемент массива: " + array.findMax(new int[] {1, 56, 34, -2, 65}));
        array.printArray(new int[] {1, 2, 3, 4});
        array.reverseArray(new int[] {1, 2, 3, 4});
    }
}