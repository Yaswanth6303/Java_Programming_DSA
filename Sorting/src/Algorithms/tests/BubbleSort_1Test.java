package Algorithms.tests;

import Algorithms.questions.BubbleSort_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSort_1Test {

    @Test
    void testBubbleSort() {
        int[] input = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort the array using bubbleSort
        int[] result = BubbleSort_1.bubbleSort(input);

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array should be sorted in ascending order using bubbleSort");
    }

    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        // Act: Sort an already sorted array using both methods
        int[] result = BubbleSort_1.bubbleSort(input.clone());

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "An already sorted array should remain sorted using bubbleSort");

    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {4, 2, 3, 2, 4};
        int[] expected = {2, 2, 3, 4, 4};

        // Act: Sort the array with duplicate values
        int[] result = BubbleSort_1.bubbleSort(input.clone());

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "The array with duplicates should be sorted correctly using bubbleSort");
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};

        // Act: Sort an empty array
        int[] result = BubbleSort_1.bubbleSort(input.clone());

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "Sorting an empty array should return an empty array using bubbleSort");
    }

    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};

        // Act: Sort a single-element array
        int[] result = BubbleSort_1.bubbleSort(input.clone());

        // Assert: Verify that the sorted result matches the expected sorted array
        assertArrayEquals(expected, result, "Sorting a single-element array should return the same array using bubbleSort");
    }
}
