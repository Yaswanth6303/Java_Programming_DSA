package faq_medium.solutions;

import java.util.*;

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

    public static class TwoSum_6 {
        public static void printArray(int [] nums) {
            for (int i = 0; i < nums.length;i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        public static int [] twoSumBrute(int [] nums, int target) {
            int n = nums.length;
            int [] twoSumValues = new int[2];

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        twoSumValues[0] = i;
                        twoSumValues[1] = j;
                        return twoSumValues;
                    }
                }
            }
            return new int[]{-1, 1};
        }
        public static int [] twoSumBetter(int [] nums, int target) {
            int n = nums.length;
            int [] twoSumValues = new int[2];

            Map<Integer, Integer> mpp= new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int neededNum = target - num;

                if (mpp.containsKey(neededNum)) {
                    twoSumValues[0] = mpp.get(neededNum);
                    twoSumValues[1] = i;
                    return twoSumValues;
                }

                mpp.put(num, i);
            }

            return new int[]{-1, 1};
        }
        public static int[] twoSumTwoPointer(int[] nums, int target) {
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

            return new int[]{-1, -1};
        }
        public static void main(String[] args) {
            int[] nums = {2, 6, 5, 8, 11};
            int target = 14;

            int [] twoSumBrute = twoSumBrute(nums, target);
            printArray(twoSumBrute);

            int [] twoSumBetter = twoSumBetter(nums, target);
            printArray(twoSumBetter);
        }
    }
}
