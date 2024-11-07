package Algorithms.solutions;

// Get the Minimum and Swap
public class SelectionSort_2 {
    /**
     * Prints the elements of an array to the console.
     *
     * @param nums The array to be printed.
     */
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line after all elements
    }

    /**
     * Sorts an array using the selection sort algorithm.
     *
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] selectionSort(int[] nums) {
        int n = nums.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Iterate through the array from 0 to n-2
            int minIndex = i; // Assume the current element is the minimum
            for (int j = i + 1; j < nums.length; j++) { // Iterate through the remaining elements
                if (nums[j] < nums[minIndex]) { // If a smaller element is found
                    minIndex = j; // Update the index of the minimum element
                }
            }
            if (minIndex != i) { // If the minimum element is not the current element
                // Swap the current element with the minimum element
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums; // Return the sorted array
    }

    /**
     * The main method where the program execution begins.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4}; // Create an unsorted array
        selectionSort(nums); // Sort the array using selection sort
        printArray(nums); // Print the sorted array
    }
}

/**
 * Complexity Analysis
 * Time Complexity: O(N^2) where N is the length of the input array. The outer loop runs
 * through each element, and the inner loop finds the smallest element in the unsorted
 * portion of the array.
 *
 * Space Complexity: O(1) as it is an in-place sorting algorithm and does not require
 * additional storage proportional to the input size.
 */
