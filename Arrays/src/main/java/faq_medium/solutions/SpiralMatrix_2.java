package faq_medium.solutions;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static class SortArray_9 {
        public static void printMatrix(int [] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        public static void sortZeroOneTwoBrute(int [] nums) {
            Arrays.sort(nums);
        }
        public static void sortZeroOneTwoBetter(int [] nums) {
            int count_0 = 0;
            int count_1 = 0;
            int count_2 = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count_0++;
                } else if (nums[i] == 1) {
                    count_1++;
                } else {
                    count_2++;
                }
            }

            for (int i = 0; i < count_0; i++) {
                nums[i] = 0;
            }

            for (int i = count_0; i < count_0 + count_1; i++) {
                nums[i] = 1;
            }

            for (int i = count_0 + count_1; i < count_0 + count_1 + count_2; i++) {
                nums[i] = 2;
            }
        }

        public static void sortZeroOneTwoOptimal(int [] nums) {
            int n = nums.length;
            int low = 0;
            int mid = 0;
            int high = n - 1;

            while(mid <= high) {
                if(nums[mid] == 0) {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                } else if(nums[mid] == 1) {
                    mid++;
                } else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
        public static void main(String[] args) {
            int[] nums = {0, 2, 1, 2, 0, 1};
            sortZeroOneTwoBrute(nums);
            printMatrix(nums);
            System.out.println();
            sortZeroOneTwoBetter(nums);
            printMatrix(nums);
            System.out.println();
            sortZeroOneTwoOptimal(nums);
            printMatrix(nums);
        }
    }
}
