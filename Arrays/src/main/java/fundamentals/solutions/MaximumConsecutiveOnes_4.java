package fundamentals.solutions;

public class MaximumConsecutiveOnes_4 {
    public static int findMaxConsecutiveOnes(int [] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int [] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}

/**
 * Complexity Analysis
 * Time Complexity: O(N), as there is single traversal of the array .Here N is the number of
 * elements in the array.
 * Space Complexity: O(1), as no additional space is used .
 */
