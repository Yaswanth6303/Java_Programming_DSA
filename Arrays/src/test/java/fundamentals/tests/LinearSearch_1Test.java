package fundamentals.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fundamentals.questions.LinearSearch_1;
import org.junit.jupiter.api.Test;

class LinearSearch_1Test {

    @Test
    void testElementFound() {
        int[] nums = {5, 3, 6, 7, 8};
        int target = 8;
        int expectedIndex = 4;
        assertEquals(expectedIndex, LinearSearch_1.linearSearch(nums, target));
    }

    @Test
    void testElementNotFound() {
        int[] nums = {5, 3, 6, 7, 8};
        int target = 9;
        int expectedIndex = -1;
        assertEquals(expectedIndex, LinearSearch_1.linearSearch(nums, target));
    }

    @Test
    void testElementAtStart() {
        int[] nums = {5, 3, 6, 7, 8};
        int target = 5;
        int expectedIndex = 0;
        assertEquals(expectedIndex, LinearSearch_1.linearSearch(nums, target));
    }

    @Test
    void testElementAtEnd() {
        int[] nums = {5, 3, 6, 7, 8};
        int target = 8;
        int expectedIndex = 4;
        assertEquals(expectedIndex, LinearSearch_1.linearSearch(nums, target));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, LinearSearch_1.linearSearch(nums, target));
    }
}