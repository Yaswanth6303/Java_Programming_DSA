package Algorithms.solutions;

import java.util.ArrayList;
import java.util.List;

public class MergeSort_4 {

    /**
     * Prints the elements of an array.
     * @param nums The array to be printed.
     */
    public static void printArray(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    /**
     * Recursively divides the array into subarrays and merges them.
     * @param nums The array to be sorted.
     * @param startIndex The starting index of the subarray.
     * @param endIndex The ending index of the subarray.
     */
    public static void mergeSortHelper(int [] nums, int startIndex, int endIndex) {
        // Calculate the middle index of the subarray.
        int midIndex = startIndex + (endIndex - startIndex) / 2;

        // Base case: If the subarray has one or zero elements, it is already sorted.
        if (startIndex >= endIndex) {
            return;
        }

        // Recursively sort the left half of the subarray.
        mergeSortHelper(nums, 0, midIndex);  //Incorrect, fixed is: mergeSortHelper(nums, startIndex, midIndex);

        // Recursively sort the right half of the subarray.
        mergeSortHelper(nums, midIndex + 1, endIndex);

        // Merge the sorted left and right halves.
        merge(nums, startIndex, midIndex, endIndex);
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     * @param nums The array containing the subarrays.
     * @param startIndex The starting index of the first subarray.
     * @param midIndex The ending index of the first subarray.
     * @param endIndex The ending index of the second subarray.
     */
    public static void merge(int [] nums, int startIndex, int midIndex, int endIndex) {
        // Initialize pointers for the left and right subarrays.
        int leftArray = startIndex;
        int rightArray = midIndex + 1;

        // Create a temporary list to store the merged elements.
        List<Integer> tempArray = new ArrayList<>();

        // Compare elements from the left and right subarrays and add the smaller element to the temporary list.
        while (leftArray <= midIndex && rightArray <= endIndex) {
            if (nums[leftArray] <= nums[rightArray]) {
                tempArray.add(nums[leftArray]);
                leftArray++;
            } else {
                tempArray.add(nums[rightArray]);
                rightArray++;
            }
        }

        // Add any remaining elements from the left subarray to the temporary list.
        while (leftArray <= midIndex) {
            tempArray.add(nums[leftArray]);
            leftArray++;
        }

        // Add any remaining elements from the right subarray to the temporary list.
        while (rightArray <= endIndex) {
            tempArray.add(nums[rightArray]);
            rightArray++;
        }

        // Copy the elements from the temporary list back to the original array.
        for (int i = startIndex; i <= endIndex; i++) {
            nums[i] = tempArray.get(i - startIndex);
        }
    }

    /**
     * Sorts an array using the merge sort algorithm.
     * @param nums The array to be sorted.
     * @return The sorted array.
     */
    public static int[] mergeSort(int [] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    /**
     * Main method to demonstrate the merge sort algorithm.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int [] nums = {3, 2, 5, 1, 4};
        mergeSort(nums);
        printArray(nums);
    }
}

/**
 * Complexity Analysis:
 * Time Complexity: O(nlogn). At each step, we divide the whole array, which takes logn
 * steps, and we assume n steps are taken to sort the array. So, the overall time
 * complexity is nlogn.
 *
 * Space Complexity: O(n). We are using a temporary array to store elements in sorted
 * order.
 */