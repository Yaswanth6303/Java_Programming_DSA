package fundamentals.solutions;

import java.util.Arrays;

public class LargestElement_2 {
    public static int largestElementBrute(int [] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);

        return nums[nums.length - 1];
    }
    public static int largestElementOptimal(int [] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int [] nums = {42, 33, 55};
        System.out.println(largestElementOptimal((nums)));
        System.out.println(largestElementBrute(nums));
    }
}

/**
 * Complexity Analysis for Brute Force
 * Time Complexity: O(N * logN), as we are sorting the array, where N is the length of the array.
 *
 * Space Complexity: O(1), since no extra space is used.
 */

/**
 * Complexity Analysis for Optimal Approach
 * Time Complexity: O(N) , since there is linear traversal of the array, where N is the
 * length of the array.
 * Space Complexity: O(1), as no additional space is used.
 */
