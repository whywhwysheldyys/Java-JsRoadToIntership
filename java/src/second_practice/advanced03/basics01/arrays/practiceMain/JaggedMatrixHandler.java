package second_practice.advanced03.basics01.arrays.practiceMain;

public class JaggedMatrixHandler {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static int calculateSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}
        };

        JaggedMatrixHandler.printMatrix(arr);
        System.out.println(JaggedMatrixHandler.calculateSum(arr));
    }
}