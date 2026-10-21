package second_practice.basics01.arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = {12, 45, -3, 89, 23, 5, 67, -10, 34};

        int max = arr[0];
        int maxIndex = 0;

        int min = arr[0];
        int minIndex = 0;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }

            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Максимальное значение массива: " + max + "(индекс: " + maxIndex + ")\n"
                            + "Минимальное значение массива: " + min + "(индекс: " + minIndex +  ")\n"
                            + "Сумма всех элементов массива: " + sum);
        System.out.printf("Среднее арифметическое: " + "%.2f\n", average);
    }
}