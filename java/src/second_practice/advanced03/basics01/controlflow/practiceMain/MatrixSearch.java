package second_practice.advanced03.basics01.controlflow.practiceMain;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 12, 17, 24},
                {9, 3, 42, 11},
                {8, 65, 19, 31}
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для его поиска в матрице: ");
        int targetNum = input.nextInt();
        boolean found = false;

        searchLabel:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == targetNum) {
                            found = true;
                            System.out.println("Число найдено! \nКолонка: " + j + "\nCтрока: " + i);
                            break searchLabel;
                        }
                    }
                }

                if (found == false) {
                    System.out.println("Такого числа нет в строке...");
                }
    }
}