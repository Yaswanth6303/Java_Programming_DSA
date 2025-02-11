package faq_medium.solutions;

import java.util.List;

public class RotateMatrix_5 {
    public static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrixBrute(int [][] matrix) {
        int n = matrix.length;

        int [][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, n);
        }
    }
    public static void transpose(int [][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int [] nums) {
        int n = nums.length;
        int first_index = 0;
        int last_index = n - 1;

        while (first_index < last_index) {
            int temp = nums[first_index];
            nums[first_index] = nums[last_index];
            nums[last_index] = temp;
            first_index++;
            last_index--;
        }
    }

    public static void rotateMatrixOptimal(int [][] matrix) {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }
    public static void main(String[] args) {
        int [][] matrix_brute = {{1, 2, 3},
                                 {4, 5, 6},
                                 {7, 8, 9}};
        rotateMatrixBrute(matrix_brute);
        printMatrix(matrix_brute);
        System.out.println();

        int [][] matrix_optimal = {{1, 2, 3},
                                   {4, 5, 6},
                                   {7, 8, 9}};
        rotateMatrixOptimal(matrix_optimal);
        printMatrix(matrix_optimal);
    }
}
