package faq_medium.solutions;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_4 {
    public static void printArray(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static int nCr(int n, int r) {
        if (r > n - r) {
            r = n - r;
        }

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return (int) res;
    }

    public static List<Integer> generateRowBrute(int n) { // n = rowNumber
        List<Integer> row = new ArrayList<>();
        for (int c = 0; c < n; c++) {
            row.add(nCr(n - 1, c));
        }
        return row;
    }


    public static List<Integer> generateRowOptimal(int rowNumber) {
        long pascalTriangleValue = 1;
        List<Integer> pascalTriangleRow = new ArrayList<>();
        pascalTriangleRow.add(1);

        for (int column = 1; column < rowNumber; column++) {
            pascalTriangleValue = pascalTriangleValue * (rowNumber - column) / column;
            pascalTriangleRow.add((int) pascalTriangleValue);
        }

        return pascalTriangleRow;
    }

    public static int[][] pascalTriangleBrute(int numRows) {
        int[][] pascalTriangle = new int[numRows][];

        for (int row = 0; row < numRows; row++) {
            pascalTriangle[row] = new int[row + 1];
            for (int col = 0; col <= row; col++) {
                pascalTriangle[row][col] = nCr(row, col);
            }
        }

        return pascalTriangle;
    }

    public static List<List<Integer>> pascalTriangleBetter(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            pascalTriangle.add(generateRowBrute(row));
        }

        return pascalTriangle;
    }


    public static List<List<Integer>> pascalTriangleOptimal(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            pascalTriangle.add(generateRowOptimal(row));
        }

        return pascalTriangle;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(nCr(5, 3));
        System.out.println();

        List<Integer> generateRowBrute = generateRowBrute(5);
        printArray(generateRowBrute);
        System.out.println();

        List<Integer> generateArrayOptimal = generateRowOptimal(5);
        printArray(generateArrayOptimal);
        System.out.println();

        int[][] pascalTriangleBrute = pascalTriangleBrute(5);
        printMatrix(pascalTriangleBrute);
        System.out.println();

        List<List<Integer>> pascalTriangleBetter = pascalTriangleBetter(5);
        printMatrix(pascalTriangleBetter);
        System.out.println();

        List<List<Integer>> pascalTriangleOptimal = pascalTriangleOptimal(5);
        printMatrix(pascalTriangleOptimal);
    }
}
