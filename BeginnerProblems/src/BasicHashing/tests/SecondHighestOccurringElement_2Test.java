package BasicHashing.tests;

import BasicHashing.questions.SecondHighestOccurringElement_2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondHighestOccurringElement_2Test {

    @Test
    void testDistinctCounts() {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        assertEquals(3, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "The second most frequent element should be 3.");
    }

    @Test
    void testTieInSecondHighest() {
        int[] nums = {1, 2, 2, 3, 3, 4, 4};
        assertEquals(1, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "When there's a tie in the second highest frequency, the smallest element among them (1) should be chosen.");
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {5};
        assertEquals(0, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "A single-element array should return 0 as there's no second highest frequency.");
    }

    @Test
    void testAllElementsSameFrequency() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(0, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "If all elements have the same frequency, there's no valid second most frequent element, so it should return 0.");
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -2, -3, -3, -3};
        assertEquals(-2, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "The array with negative numbers should return -2 as the second most frequent element.");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, SecondHighestOccurringElement_2.secondHighestElement(nums),
                "An empty array should return 0 as there's no element.");
    }
}
