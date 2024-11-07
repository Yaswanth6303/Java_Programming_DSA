package Algorithms.tests;

import Algorithms.questions.SelectionSort_2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSort_2Test {

    @Test
    void testSelectionSortWithUnsortedArray() {
        int[] input = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort the array using selectionSort
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array should be sorted in ascending order");
    }

    @Test
    void testSelectionSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort the already sorted array
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the result remains the same
        assertArrayEquals(expected, result, "An already sorted array should remain sorted");
    }

    @Test
    void testSelectionSortWithArrayContainingDuplicates() {
        int[] input = {4, 2, 3, 2, 4};
        int[] expected = {2, 2, 3, 4, 4};

        // Act: Sort the array with duplicate values
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array with duplicates should be sorted correctly");
    }

    @Test
    void testSelectionSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};

        // Act: Sort an empty array
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the result is an empty array
        assertArrayEquals(expected, result, "Sorting an empty array should return an empty array");
    }

    @Test
    void testSelectionSortWithSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};

        // Act: Sort a single-element array
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the result is the same single-element array
        assertArrayEquals(expected, result, "Sorting a single-element array should return the same array");
    }

    @Test
    void testSelectionSortWithNegativeNumbers() {
        int[] input = {-3, -1, -5, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};

        // Act: Sort an array with negative numbers
        int[] result = SelectionSort_2.selectionSort(input);

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array with negative numbers should be sorted in ascending order");
    }
}
