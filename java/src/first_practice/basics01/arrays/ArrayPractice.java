package first_practice.basics01.arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6};

       int max = arr[0];
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Сумма всех элементов: " + sum);
    }
}