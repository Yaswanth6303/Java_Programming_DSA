package faq_medium.solutions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_2 {
    // Method to print a 2D List matrix
    public static void printMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // Method to print a 1D List
    public static void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to return the spiral order of a matrix
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        ArrayList<Integer> spiralOrder = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                spiralOrder.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                spiralOrder.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left along the bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiralOrder;
    }

    public static void main(String[] args) {
        int[][] spiralMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        List<List<Integer>> originalMatrix = new ArrayList<>();
        for (int[] row : spiralMatrix) {
            List<Integer> listRow = new ArrayList<>();
            for (int num : row) {
                listRow.add(num);
            }
            originalMatrix.add(listRow);
        }
        printMatrix(originalMatrix);

        List<Integer> spiralOrderMatrix = spiralOrder(spiralMatrix);

        System.out.println("\nSpiral Order:");
        printList(spiralOrderMatrix);
    }
}
