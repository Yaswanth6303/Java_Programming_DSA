package BasicHashing.tests;

import BasicHashing.questions.HighestOccurringElement_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HighestOccurringElement_1Test {

    @Test
    void testSingleMostFrequentElement() {
        int[] nums = {4, 4, 5, 6, 7};
        assertEquals(4, HighestOccurringElement_1.mostFrequentElement(nums), "The most frequent element should be 4.");
    }

    @Test
    void testTieWithSmallerElement() {
        int[] nums = {4, 4, 5, 5, 6};
        assertEquals(4, HighestOccurringElement_1.mostFrequentElement(nums), "With a tie, the smallest element should be returned, which is 4.");
    }

    @Test
    void testAllElementsSame() {
        int[] nums = {3, 3, 3, 3};
        assertEquals(3, HighestOccurringElement_1.mostFrequentElement(nums), "If all elements are the same, the element itself should be returned.");
    }

    @Test
    void testNoRepeats() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, HighestOccurringElement_1.mostFrequentElement(nums), "If all elements have the same frequency, the smallest element should be returned, which is 1.");
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -1, -2, -2, -3, -1};
        assertEquals(-1, HighestOccurringElement_1.mostFrequentElement(nums), "The most frequent element should be -1 as it has the highest frequency.");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(-1, HighestOccurringElement_1.mostFrequentElement(nums), "An empty array should return -1 as there's no element.");
    }
}
