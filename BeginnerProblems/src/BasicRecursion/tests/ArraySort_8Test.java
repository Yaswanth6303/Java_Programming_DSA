package BasicRecursion.tests;

import BasicRecursion.questions.ArraySort_8;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ArraySort_8Test {

    @Test
    void testSortedArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        assertTrue(ArraySort_8.sortArray(nums), "The array is sorted, so it should return true.");
    }

    @Test
    void testUnsortedArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        assertFalse(ArraySort_8.sortArray(nums), "The array is not sorted, so it should return false.");
    }

    @Test
    void testSingleElementArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        assertTrue(ArraySort_8.sortArray(nums), "A single-element array is considered sorted, so it should return true.");
    }

    @Test
    void testEmptyArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        assertTrue(ArraySort_8.sortArray(nums), "An empty array is considered sorted, so it should return true.");
    }

    @Test
    void testArrayWithDuplicates() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        assertTrue(ArraySort_8.sortArray(nums), "The array with duplicates in order should return true.");
    }

    @Test
    void testArrayWithNegativeNumbers() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-3);
        nums.add(-2);
        nums.add(0);
        nums.add(1);
        nums.add(3);
        assertTrue(ArraySort_8.sortArray(nums), "The sorted array with negative numbers should return true.");
    }

    @Test
    void testArrayWithDescendingOrder() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        assertFalse(ArraySort_8.sortArray(nums), "The array in descending order should return false.");
    }
}
