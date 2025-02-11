package fundamentals.solutions;

import java.util.Arrays;

public class SecondLargestElement_3 {
    public static int secondLargestBrute(int [] nums) {
        int n = nums.length;
        if (n < 2) {
            return -1;
        }
        Arrays.sort(nums);
        int largest = nums[n - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (largest != nums[i]) {
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static int secondLargestBetter(int [] nums) {
        int n = nums.length;

        if (n < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > firstLargest) {
                firstLargest = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > secondLargest && nums[i] != firstLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static int secondLargestOptimal(int [] nums) {
        int n = nums.length;

        if (n < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != firstLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    public static void main(String[] args) {
        int [] nums = {88, 65, 88, 54, 63};
        System.out.println(secondLargestBrute(nums));
        System.out.println(secondLargestBetter(nums));
        System.out.println(secondLargestOptimal(nums));
    }
}

/**
 * Complexity Analysis
 * Brute Force Approach
 * Time Complexity: O(N * log N) for sorting the array, where N is the length of the array.
 *
 * Space Complexity: O(1) as no additional space is used.
 *
 * Better Approach
 * Time Complexity: O(N) + O(N) = O(2N), due to two linear traversals, where N is the length
 * of the array.
 *
 * Space Complexity: O(1), as no additional space is required.
 *
 * Optimal Approach
 * Time Complexity: O(N), because the solution involves a single traversal, where N is the
 * length of the array,
 * Space Complexity: O(1) as no additional space is required.
 */
