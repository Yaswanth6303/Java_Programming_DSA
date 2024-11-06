package BasicHashing.solutions;

import java.util.HashMap;
import java.util.Map;

public class FrequencySum_3 {
    /**
     * Calculates the sum of the maximum and minimum frequencies of elements in an array using a brute-force approach.
     *
     * @param nums The input array of integers.
     * @return The sum of the maximum and minimum frequencies.
     */
    public static int frequencySumBrute(int[] nums) {
        int n = nums.length; // Get the length of the array
        int maxCount = Integer.MIN_VALUE; // Initialize maxCount to the smallest possible integer value
        int minCount = Integer.MAX_VALUE; // Initialize minCount to the largest possible integer value

        // If the array is empty, return 0
        if (n == 0) return 0;

        // Create a boolean array to track visited elements
        boolean[] visitedArray = new boolean[n];

        // Iterate through the array to find frequencies
        for (int i = 0; i < n; i++) {
            int count = 0; // Initialize count for the current element
            // If the current element has already been visited, skip it
            if (visitedArray[i] == true) continue;
            // Iterate through the remaining elements to count occurrences
            for (int j = i; j < n; j++) {
                // If the current element matches the element at index j
                if (nums[i] == nums[j]) {
                    count++; // Increment the count
                    visitedArray[j] = true; // Mark the element at index j as visited
                }
            }

            // Update maxCount and minCount
            maxCount = Math.max(count, maxCount);
            minCount = Math.min(count, minCount);
        }
        // Return the sum of maxCount and minCount
        return maxCount + minCount;
    }

    /**
     * Calculates the sum of the maximum and minimum frequencies of elements in an array using an optimized approach with a HashMap.
     *
     * @param nums The input array of integers.
     * @return The sum of the maximum and minimum frequencies.
     */
    public static int frequencySumOptimal(int[] nums) {
        int n = nums.length; // Get the length of the array

        int maxCount = Integer.MIN_VALUE; // Initialize maxCount to the smallest possible integer value
        int minCount = Integer.MAX_VALUE; // Initialize minCount to the largest possible integer value
        // Create a HashMap to store element frequencies
        Map<Integer, Integer> mpp = new HashMap<>();

        // If the array is empty, return 0
        if (n == 0) return 0;

        // Iterate through the array to store frequencies in the HashMap
        for (int i = 0; i < n; i++) {
            // If the element is already in the map, increment its count; otherwise, add it with count 1
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate through the values (frequencies) in the HashMap
        for (int count : mpp.values()) {
            // Update maxCount and minCount
            maxCount = Math.max(count, maxCount);
            minCount = Math.min(count, minCount);
        }

        // Return the sum of maxCount and minCount
        return maxCount + minCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println("The sum of Maximum and Minimum count is: " + frequencySumBrute(nums));
        System.out.println("The sum of Maximum and Minimum count is: " + frequencySumOptimal(nums));
    }
}
