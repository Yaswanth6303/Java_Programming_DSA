package fundamentals.tests;

import fundamentals.questions.LargestElement_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestElement_2Test {

    @Test
    void testLargestElementWithTypicalArray() {
        int[] nums = {42, 33, 55};
        Assertions.assertEquals(55, LargestElement_2.largestElement(nums));
    }

    @Test
    void testLargestElementWithNegativeNumbers() {
        int[] nums = {-10, -20, -5, -30};
        assertEquals(-5, LargestElement_2.largestElement(nums));
    }

    @Test
    void testLargestElementWithSingleElement() {
        int[] nums = {10};
        assertEquals(10, LargestElement_2.largestElement(nums));
    }

    @Test
    void testLargestElementWithEmptyArray() {
        int[] nums = {};
        assertEquals(-1, LargestElement_2.largestElement(nums));
    }

    @Test
    void testLargestElementWithIdenticalElements() {
        int[] nums = {7, 7, 7, 7};
        assertEquals(7, LargestElement_2.largestElement(nums));
    }
}
