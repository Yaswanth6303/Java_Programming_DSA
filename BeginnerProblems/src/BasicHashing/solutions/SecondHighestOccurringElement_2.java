package BasicHashing.solutions;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccurringElement_2 {

    /**
     * Finds the second most frequent element in an array using a brute-force approach.
     *
     * @param nums The input array of integers.
     * @return The second most frequent element in the array.
     */
    public static int secondHighestElementBrute(int[] nums) {
        // Initialize variables to store the most frequent element, its count,
        // the second most frequent element, and its count.
        int firstMaxCount = 0;
        int firstMaxElement = 0;
        int secondMaxCount = 0;
        int secondMaxElement = 0;
        int n = nums.length;

        // If the array is empty, return 0.
        if (n == 0) return 0;

        // Create a boolean array to keep track of visited elements.
        boolean[] visitedArray = new boolean[n];

        // Iterate through the array to find the frequencies of each element.
        for (int i = 0; i < n; i++) {
            int count = 0;
            // If the current element has already been visited, skip it.
            if (visitedArray[i] == true) continue;
            // Iterate through the remaining elements to count the occurrences of the current element.
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    // Mark the current element as visited.
                    visitedArray[j] = true;
                }
            }

            // Update the most frequent and second most frequent elements and their counts.
            if (count > firstMaxCount) {
                secondMaxCount = firstMaxCount;
                firstMaxCount = count;
                secondMaxElement = firstMaxElement;
                firstMaxElement = nums[i];
            } else if (count == firstMaxCount) {
                firstMaxElement = Math.min(firstMaxElement, nums[i]);
            } else if (count > secondMaxCount) {
                secondMaxCount = nums[i]; //Bug:Should be count
                secondMaxElement = nums[i];
            } else if (count == secondMaxCount) {
                secondMaxElement = Math.min(secondMaxElement, nums[i]);
            }
        }
        // Return the second most frequent element.
        return secondMaxElement;
    }

    /**
     * Finds the second most frequent element in an array using a hash map.
     *
     * @param nums The input array of integers.
     * @return The second most frequent element in the array.
     */
    public static int secondHighestElementOptimal(int[] nums) {
        int n = nums.length;
        int firstMaxCount = 0;
        int firstMaxElement = 0;
        int secondMaxCount = 0;
        int secondMaxElement = 0;

        // Create a hash map to store the frequencies of each element.
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate through the hash map to find the most frequent and second most frequent elements.
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int element = it.getKey();
            int count = it.getValue();

            // Update the most frequent and second most frequent elements and their counts.
            if (count > firstMaxCount) {
                secondMaxCount = firstMaxCount;
                firstMaxCount = count;
                secondMaxElement = firstMaxElement;
                firstMaxElement = element;
            } else if (count == firstMaxCount) {
                firstMaxElement = Math.min(firstMaxElement, element);
            } else if (count > secondMaxCount) {
                secondMaxCount = count;
                secondMaxElement = element;
            } else if (count == secondMaxCount) {
                secondMaxElement = Math.min(secondMaxElement, element);
            }
        }
        // Return the second most frequent element.
        return secondMaxElement;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println("The second highest occurring element in the array is: " + secondHighestElementBrute(nums));
        System.out.println("The second highest occurring element in the array is: " + secondHighestElementOptimal(nums));
    }
}
