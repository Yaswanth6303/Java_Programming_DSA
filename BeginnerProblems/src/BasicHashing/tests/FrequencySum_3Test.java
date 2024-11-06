package BasicHashing.tests;

import BasicHashing.questions.FrequencySum_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencySum_3Test {

    @Test
    void testAllSameElements() {
        int[] nums = {4, 4, 4, 4};
        // Only one unique element (4), so maxCount = minCount = 4, and result is 4 + 4 = 8
        assertEquals(8, FrequencySum_3.frequencySum(nums));
    }

    @Test
    void testMultipleUniqueElements() {
        int[] nums = {1, 2, 3};
        // All elements have the same frequency of 1. maxCount = minCount = 1, result = 1 + 1 = 2
        assertEquals(2, FrequencySum_3.frequencySum(nums));
    }

    @Test
    void testSomeRepeatedElements() {
        int[] nums = {1, 2, 2, 3, 3, 3};
        // maxCount = 3 (for element 3), minCount = 1 (for element 1), result = 3 + 1 = 4
        assertEquals(4, FrequencySum_3.frequencySum(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        // Only one element, so maxCount = minCount = 1, result = 1 + 1 = 2
        assertEquals(2, FrequencySum_3.frequencySum(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        // Edge case: empty array, no counts to consider, result should be 0
        assertEquals(0, FrequencySum_3.frequencySum(nums));
    }

    @Test
    void testMultipleOccurrencesOfOneElement() {
        int[] nums = {3, 3, 3, 3, 3};
        // Only one unique element (3), maxCount = minCount = 5 (since the element repeats 5 times)
        assertEquals(10, FrequencySum_3.frequencySum(nums)); // 5 + 5 = 10
    }
}
