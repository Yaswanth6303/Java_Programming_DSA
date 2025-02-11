package fundamentals.solutions;

public class LinearSearch_1 {
    public static int linearSearch(int [] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {5, 3, 6, 7, 8};
        System.out.println(linearSearch(nums, 8));
    }
}

/**
 * Complexity Analysis
 * Time Complexity: O(N), in worst case entire array will be traversed, taking a time of
 * N where N is size of the array.
 *
 * Space Complexity: O(1), as no additional space is used apart from the input array, the
 * space complexity stays constant.
 */
