package Algorithms.solutions;

// Takes an element and places it in its correct position.
public class InsertionSort_3 {

    /**
     * Prints the elements of an array to the console.
     *
     * @param nums The array to be printed.
     */
    public static void printArray(int[] nums) {
        int n = nums.length; // Get the length of the array
        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " "); // Print the current element followed by a space
        }
        System.out.println(); // Print a new line after printing all elements
    }

    /**
     * Sorts an array using the Insertion Sort algorithm.
     *
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] insertionSort(int[] nums) {
        int n = nums.length; // Get the length of the array
        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            int j = 1; // Initialize j to 1 for the inner loop
            // Compare the current element with the previous element and swap if necessary
            // (This will fix the bug. See explanation below)
            while (j > 0 && nums[j - 1] > nums[j]) {
                // Swap elements using a temporary variable
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--; // Decrement j to move towards the beginning of the array
            }
        }
        return nums; // Return the sorted array
    }

    /**
     * The main method where the program execution begins.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4}; // Create an unsorted array
        insertionSort(nums); // Sort the array using insertionSort
        printArray(nums); // Print the sorted array
    }
}

/**
 * Complexity Analysis
 * Time Complexity: O(N^2) for the worst and average cases, where N is the size of the
 * array. This is because the outer loop runs N times, and for each pass, the inner loop
 * runs up to N times as well, resulting in approximately N xN operations, hence O(N^2).
 * The best-case time complexity occurs when the array is already sorted, in which case
 * the inner loop doesn't run at all, leading to a time complexity of O(N).
 *
 * Space Complexity: O(1) because Insertion Sort is an in-place sorting algorithm,
 * meaning it sorts the array by modifying the original array without using additional
 * data structures that grow with the size of the input.
 */