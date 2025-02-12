package faq_medium.solutions;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_6 {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] twoSumBrute(int[] nums, int target) {
        int n = nums.length;

        int [] targetValuesArray = new int[2];
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    targetValuesArray[0] = i;
                    targetValuesArray[1] = j;
                    return targetValuesArray;
                }
            }
        }

        return new int[]{-1, -1}; // If the nums array is empty return -1, -1.
    }
    public static int[] twoSumBetter(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int num = nums[i];

            int neededNum = target - num;

            if(numsMap.containsKey(neededNum)) {
                return new int[]{numsMap.get(neededNum), i};
            }

            numsMap.put(num, i);
        }

        return new int[]{-1, -1};
    }
    public static int[] twoSumOptimal(int[] nums, int target) {
        int n = nums.length;
        int[][] indexedNums = new int[n][2];

        // Store original indices before sorting
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i]; // Store value
            indexedNums[i][1] = i; // Store index
        }

        // Sort by value
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];

            if (sum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // No solution found
    }
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        int [] twoSumBrute = twoSumBrute(nums, target);
        int [] twoSumBetter = twoSumBetter(nums, target);
        int [] twoSumOptimal = twoSumOptimal(nums, target);

        printArray(twoSumBrute);
        printArray(twoSumBetter);
        printArray(twoSumOptimal);
    }
}
