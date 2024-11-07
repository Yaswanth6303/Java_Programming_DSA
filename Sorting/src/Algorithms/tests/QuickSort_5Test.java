package Algorithms.tests;

import Algorithms.solutions.QuickSort_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSort_5Test {

    @Test
    void testQuickSortWithUnsortedArray() {
        int[] input = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort the array using quickSort
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array should be sorted in ascending order");
    }

    @Test
    void testQuickSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort the already sorted array
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the array remains unchanged
        assertArrayEquals(expected, result, "An already sorted array should remain sorted");
    }

    @Test
    void testQuickSortWithArrayContainingDuplicates() {
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};

        // Act: Sort the array with duplicate values
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array with duplicates should be sorted correctly");
    }

    @Test
    void testQuickSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};

        // Act: Sort an empty array
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the result is an empty array
        assertArrayEquals(expected, result, "Sorting an empty array should return an empty array");
    }

    @Test
    void testQuickSortWithSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};

        // Act: Sort a single-element array
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the result is the same single-element array
        assertArrayEquals(expected, result, "Sorting a single-element array should return the same array");
    }

    @Test
    void testQuickSortWithNegativeNumbers() {
        int[] input = {-3, -1, -5, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};

        // Act: Sort an array with negative numbers
        int[] result = QuickSort_5.quickSort(input);

        // Assert: Verify the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array with negative numbers should be sorted in ascending order");
    }
}
