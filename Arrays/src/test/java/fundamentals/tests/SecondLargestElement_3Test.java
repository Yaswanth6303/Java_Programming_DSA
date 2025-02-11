package fundamentals.tests;

import fundamentals.questions.SecondLargestElement_3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondLargestElement_3Test {

    @Test
    void testWithDistinctElements() {
        int[] nums = {8, 8, 7, 6, 5};
        assertEquals(7, new SecondLargestElement_3().secondLargest(nums));
    }

    @Test
    void testWithIdenticalElements() {
        int[] nums = {10, 10, 10, 10, 10};
        assertEquals(-1, new SecondLargestElement_3().secondLargest(nums));
    }

    @Test
    void testWithNegativeAndPositiveNumbers() {
        int[] nums = {-5, -1, 0, 3, 2};
        assertEquals(2, new SecondLargestElement_3().secondLargest(nums));
    }

    @Test
    void testWithSingleElement() {
        int[] nums = {42};
        assertEquals(-1, new SecondLargestElement_3().secondLargest(nums));
    }

    @Test
    void testWithTwoElements() {
        int[] nums = {5, 10};
        assertEquals(5, new SecondLargestElement_3().secondLargest(nums));
    }
}
