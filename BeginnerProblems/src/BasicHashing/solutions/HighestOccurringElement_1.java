package BasicHashing.solutions;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement_1 {
    /**
     * Finds the most frequent element in an array using a brute-force approach.
     * If multiple elements have the same maximum frequency, it returns the smallest one.
     *
     * @param nums The input array of integers.
     * @return The most frequent element (or the smallest among those with the same maximum frequency).
     */
    public static int mostFrequentElementBrute(int[] nums) {
        int maxElement = -1; // Initialize the most frequent element to -1 (default value)
        int maxCount = 0;    // Initialize the maximum frequency to 0
        int n = nums.length;   // Get the length of the array
        boolean[] visitedArray = new boolean[n]; // Create a boolean array to track visited elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element has been visited, skip it
            if (visitedArray[i] == true) continue;

            int count = 0; // Initialize the count for the current element
            // Iterate through the remaining elements to count occurrences
            for (int j = i; j < n; j++) {
                // If the current element matches the element at index i, increment the count
                if (nums[i] == nums[j]) {
                    count++;
                    visitedArray[j] = true; // Mark the element at index j as visited
                }
            }

            // Update maxElement and maxCount if the current element has a higher frequency
            if (count > maxCount) {
                maxCount = count;
                maxElement = nums[i];
                // If the current element has the same frequency as the max, choose the smaller one
            } else if (count == maxCount) {
                maxElement = Math.min(nums[i], maxElement);
            }
        }
        return maxElement; // Return the most frequent element
    }

    /**
     * Finds the most frequent element in an array using a HashMap (optimal approach).
     * If multiple elements have the same maximum frequency, it returns the smallest one.
     *
     * @param nums The input array of integers.
     * @return The most frequent element (or the smallest among those with the same maximum frequency).
     */
    public static int mostFrequentElementOptimal(int[] nums) {
        int n = nums.length;           // Get the length of the array
        int maxElement = -1;         // Initialize the most frequent element to -1
        int maxCount = 0;            // Initialize the maximum frequency to 0

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> mpp = new HashMap<>();
        // Iterate through the array and update the frequency of each element in the HashMap
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate through the HashMap to find the element with the highest frequency
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int element = it.getKey();   // Get the current element
            int count = it.getValue();  // Get the frequency of the current element

            // Update maxElement and maxCount if the current element has a higher frequency
            if (count > maxCount) {
                maxCount = count;
                maxElement = element;
                // If the current element has the same frequency as the max, choose the smaller one
            } else if (count == maxCount) {
                maxElement = Math.min(maxElement, element);
            }
        }
        return maxElement; // Return the most frequent element
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};
        System.out.println("The highest occurring element in the array is: " + mostFrequentElementBrute(nums));
        System.out.println("The highest occurring element in the array is: " + mostFrequentElementOptimal(nums));
    }
}
