package BasicRecursion.solutions;
import java.util.Arrays;

public class ReverseArray_7 {
    public static int[] reverseArray(int[] nums) {
        reverse(nums, 0, nums.length - 1);
        return nums;
    }

    public static void reverse(int [] nums, int startIndex, int endIndex) {
        if(startIndex >= endIndex) return;

        int temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;

        reverse(nums, startIndex + 1, endIndex - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] reversedNums = reverseArray(nums);
        System.out.println(Arrays.toString(reversedNums)); 
    }
}
