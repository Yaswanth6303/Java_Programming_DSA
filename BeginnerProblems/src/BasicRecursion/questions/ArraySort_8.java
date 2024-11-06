package BasicRecursion.questions;

import java.util.ArrayList;

public class ArraySort_8 {
    public static boolean sortArray(ArrayList<Integer> nums){
        // Write your code here
        return isSort(nums, 0, 1);
    }
    public static boolean isSort(ArrayList<Integer> nums, int firstIndex, int secondIndex) {
        if (secondIndex >= nums.size() - 1) {
            return true;
        }

        if (nums.get(firstIndex) > nums.get(secondIndex)) {
            return false;
        }

        return isSort(nums, firstIndex + 1, secondIndex + 1);
    }
}
