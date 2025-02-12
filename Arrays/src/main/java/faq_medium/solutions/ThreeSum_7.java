package faq_medium.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class ThreeSum_7 {
    public static void printMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSumBrute(int [] nums) {
        int n = nums.length;

        Set<List<Integer>> tripletSet = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> tripletList = new ArrayList<>();
                        tripletList.add(nums[i]);
                        tripletList.add(nums[j]);
                        tripletList.add(nums[k]);

                        Collections.sort(tripletList);
                        tripletSet.add(tripletList);
                    }
                }
            }
        }

        List<List<Integer>> tripletList = new ArrayList<>(tripletSet);

        return tripletList;
    }
    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};

        List<List<Integer>> tripletSetBrute = threeSumBrute(nums);
        printMatrix(tripletSetBrute);
    }
}
