package fundamentals.solutions;

public class LeftRotateByK_6 {
    public static void rotateArrayBrute(int [] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int [] nums, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public static void rotateArrayOptimal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, n - 1);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rotateArrayOptimal(nums, 800);
        printArray(nums);
        int [] array = {1, 2, 3, 4, 5};
        rotateArrayBrute(array, 2);
        printArray(array);
    }
}

/**
 * Complexity Analysis:
 * Brute Force Approach
 * Time Complexity: O(N), as each element in the array is reversed three times. Here N is
 * the length of the array.
 *
 * Space Complexity: O(1) as no extra space is used .
 *
 * Optimal Approach
 * Time Complexity: O(N), as each element in the array is reversed three times. Here N is
 * the length of the array.
 *
 * Space Complexity: O(1) as no extra space is used .
 */