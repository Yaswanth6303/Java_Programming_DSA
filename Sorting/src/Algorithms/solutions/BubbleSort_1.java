package Algorithms.solutions;

// Class to implement Bubble Sort algorithm
public class BubbleSort_1 {

    /**
     * Prints the elements of an array.
     *
     * @param nums The array to be printed.
     */
    public static void printArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line after printing all elements
    }

    /**
     * Sorts an array using the basic Bubble Sort algorithm (Brute Force).
     *
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] bubbleSortBrute(int[] nums) {
        int n = nums.length;
        // Outer loop iterates through each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares adjacent elements and swaps if necessary
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums; // Return the sorted array
    }

    /**
     * Complexity Analysis:
     * Time Complexity: O(N^2) for the worst, average cases and best case.
     * Here, N is the size of the array.
     *
     * Space Complexity: O(1), because Bubble Sort is an in-place sorting algorithm, meaning
     * it only requires a constant amount of extra space for its operations, regardless of
     * the size of the input array.
     */

    /**
     * Sorts an array using an optimized Bubble Sort algorithm.
     * This optimization checks if any swaps were made in an iteration.
     * If no swaps were made, the array is already sorted, and the algorithm terminates.
     *
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] bubbleSortBetter(int[] nums) {
        int n = nums.length;
        // Outer loop iterates through each element of the array
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false; // Flag to track if any swaps were made
            // Inner loop compares adjacent elements and swaps if necessary
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true; // Set the flag to true as a swap occurred
                }
            }
            // If no swaps were made in this iteration, the array is sorted
            if (!isSwapped) {
                break; // Exit the outer loop as the array is already sorted
            }
        }
        return nums; // Return the sorted array
    }

    /**
     * Main method to test the Bubble Sort algorithms.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4};
        bubbleSortBrute(nums); // Sort the first array using the brute force method
        printArray(nums); // Print the sorted array

        int[] nums1 = {13, 28, 55, 14, 43};
        bubbleSortBetter(nums1); // Sort the second array using the optimized method
        printArray(nums1); // Print the sorted array
    }
}

/**
 * Complexity Analysis:
 * Time Complexity: O(N^2) for the worst and average cases and O(N) for the best case.
 * Here, N is the size of the array.
 *
 * Space Complexity: O(1), because Bubble Sort is an in-place sorting algorithm, meaning
 * it only requires a constant amount of extra space for its operations, regardless of
 * the size of the input array.
 */
