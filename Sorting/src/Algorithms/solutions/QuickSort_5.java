package Algorithms.solutions;

// This class implements the QuickSort algorithm to sort an array of integers.
public class QuickSort_5 {

    /**
     * Prints the elements of an array to the console.
     *
     * @param nums The array to be printed.
     */
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    /**
     * Partitions the array around a pivot element.
     *
     * @param nums       The array to be partitioned.
     * @param startIndex The starting index of the subarray to be partitioned.
     * @param endIndex   The ending index of the subarray to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    public static int partition(int[] nums, int startIndex, int endIndex) {
        // Select the first element as the pivot.
        int i = startIndex;
        int j = endIndex;
        int pivot = nums[startIndex];

        // Iterate while i is less than j.
        while (i < j) {
            // Find an element greater than the pivot from the left (i).
            while (nums[i] <= pivot && i < endIndex) {
                i++;
            }
            // Find an element smaller than the pivot from the right (j).
            while (nums[j] >= pivot && j > startIndex) {
                j--;
            }
            // If i is still less than j, swap the elements at i and j.
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Place the pivot element in its correct position by swapping it with the element at j.
        int temp = nums[startIndex];
        nums[startIndex] = nums[j];
        nums[j] = temp;

        // Return the index of the pivot element.
        return j;
    }

    /**
     * Recursively sorts the array using the QuickSort algorithm.
     *
     * @param nums       The array to be sorted.
     * @param startIndex The starting index of the subarray to be sorted.
     * @param endIndex   The ending index of the subarray to be sorted.
     */
    public static void quickSortHelper(int[] nums, int startIndex, int endIndex) {
        // Base case: If startIndex is greater than or equal to endIndex, the subarray is already sorted.
        if (startIndex < endIndex) {
            // Partition the array and get the index of the pivot element.
            int partitionIndex = partition(nums, startIndex, endIndex);
            // Recursively sort the subarray before the pivot element.
            quickSortHelper(nums, startIndex, partitionIndex - 1);
            // Recursively sort the subarray after the pivot element.
            quickSortHelper(nums, partitionIndex + 1, endIndex);
        }
    }

    /**
     * Sorts the array using the QuickSort algorithm.
     *
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    /**
     * Main method to demonstrate the QuickSort algorithm.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4};
        quickSort(nums);
        printArray(nums);
    }
}

/**
 * Complexity Analysis:
 * Time Complexity: O(N*logN), where N = size of the array. At each step, we divide the
 * whole array, which takes logN steps, and n steps are taken for the partition()
 * function, so overall time complexity will be N*logN.
 *
 * The following recurrence relation can be written for Quick sort:
 * F(n) = F(k) + F(n-1-k)
 *
 * Here, k is the number of elements smaller or equal to the pivot and n-1-k denotes
 * elements greater than the pivot.
 *
 * There can be 2 cases:
 * Worst Case: This case occurs when the pivot is the greatest or smallest element of
 * the array. If the partition is done and the last element is the pivot, then the worst
 * case would be either in the increasing order of the array or in the decreasing order
 * of the array.
 *
 * Recurrence:
 * F(n) = F(0) + F(n-1) or F(n) = F(n-1) + F(0)
 *
 * Worst Case Time Complexity: O(n2)
 * Best Case: This case occurs when the pivot is the middle element or near to middle element of the array.
 *
 * Recurrence:
 * F(n) = 2F(n/2)
 *
 * Time Complexity for the best and average case: O(N*logN)
 *
 * Space Complexity: O(1) + O(N) auxiliary stack space, where N = size of the array.
 */
