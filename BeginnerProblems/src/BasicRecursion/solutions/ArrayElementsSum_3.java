package BasicRecursion.solutions;

public class ArrayElementsSum_3 {
    public static int arraySum(int [] nums) {
        return sumArray(nums, 0);
    }
    public static int sumArray(int [] nums, int startIndex) {
        if (startIndex >= nums.length) {
            return 0;
        }

        return nums[startIndex] + sumArray(nums, startIndex + 1);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int sum = arraySum(nums);
        System.out.println(sum); 
    }
}
