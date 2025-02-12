package faq_medium.solutions;

import java.util.*;

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
    public static List<List<Integer>> threeSumBetter(int [] nums) {
        int n = nums.length;

        Set<List<Integer>> tripletSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int thirdValue = -(nums[i] + nums[j]);
                if (hashset.contains(thirdValue)) {
                    List<Integer> tripletList = new ArrayList<>();
                    tripletList.add(nums[i]);
                    tripletList.add(nums[j]);
                    tripletList.add(thirdValue);

                    Collections.sort(tripletList);
                    tripletSet.add(tripletList);
                }
                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> tripletList = new ArrayList<>(tripletSet);

        return tripletList;
    }
    public static List<List<Integer>> threeSumOptimal(int[] nums) {
        int n = nums.length;
        List<List<Integer>> tripletSet = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements for the first element
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--; // Decrease the sum
                } else if (sum < 0) {
                    j++; // Increase the sum
                } else {
                    List<Integer> tripletList = Arrays.asList(nums[i], nums[j], nums[k]);
                    tripletSet.add(tripletList);
                    j++;
                    k--;

                    // Skip duplicates for the second and third elements
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return tripletSet;
    }

    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};

        List<List<Integer>> tripletSetBrute = threeSumBrute(nums);
        printMatrix(tripletSetBrute);
        System.out.println();
        List<List<Integer>> tripletSetBetter = threeSumBetter(nums);
        printMatrix(tripletSetBetter);
        System.out.println();
        List<List<Integer>> tripletSetOptimal = threeSumOptimal(nums);
        printMatrix(tripletSetOptimal);
    }
}
