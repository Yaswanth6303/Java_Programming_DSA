package fundamentals.solutions;

public class LeftRotateByOne_5 {
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void rotateArrayByOne(int [] nums) {
        int n = nums.length;
        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
        printArray(nums);
    }
}

/**
 * Complexity Analysis
 * Time Complexity: O(N), where N is the number of elements in the array. Each element is
 * visited once during the iteration.
 *
 * Space Complexity: O(1). The space used does not depend on the size of the input array and
 * remains constant.
 */