package BasicRecursion.solutions;

import java.util.ArrayList;

public class ArraySort_8 {
    public static boolean sortArray(ArrayList<Integer> nums){
        if (nums.size() < 1) {
            return true;
        }
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
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(sortArray(nums));
    }
}
