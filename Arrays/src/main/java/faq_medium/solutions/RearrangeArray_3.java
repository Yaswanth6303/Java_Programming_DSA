package faq_medium.solutions;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray_3 {
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static int [] rearrangeArrayBrute(int [] nums) {
        int n = nums.length;

        List<Integer> positiveIndex = new ArrayList<>();
        List<Integer> negativeIndex = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positiveIndex.add(num);
            } else {
                negativeIndex.add(num);
            }
        }

        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = positiveIndex.get(i);
            nums[2 * i + 1] = negativeIndex.get(i);
        }

        return nums;
    }

    public static int [] rearrangeArrayOptimal(int [] nums) {
        int n = nums.length;

        int positiveIndex = 0;
        int negativeIndex = 1;

        int [] rearrangeArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                rearrangeArray[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                rearrangeArray[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return rearrangeArray;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, -4, -5};
        int [] rearrangedArrayBrute = rearrangeArrayBrute(nums);
        printArray(rearrangedArrayBrute);
        int [] rearrangedArrayOptimal = rearrangeArrayOptimal(nums);
        printArray(rearrangedArrayOptimal);
    }
}
