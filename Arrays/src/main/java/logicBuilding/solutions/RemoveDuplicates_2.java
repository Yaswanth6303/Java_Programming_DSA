package logicBuilding.solutions;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates_2 {
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static int removeDuplicatesBrute(int [] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int value : nums) {
            set.add(value);
        }

        int size = set.size();
        int j = 0;

        for (int value : set) {
            nums[j] = value;
            j++;
        }
        return size;
    }
    public static int removeDuplicateOptimal(int [] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 3, 5, 6};
        removeDuplicatesBrute(nums);
        printArray(nums);
        int [] nums1 = {-2, 2, 4, 4, 4, 4, 5, 5};
        removeDuplicateOptimal(nums1);
        printArray(nums1);
    }
}
