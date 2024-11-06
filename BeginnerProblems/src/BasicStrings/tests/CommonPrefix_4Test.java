package BasicStrings.tests;

import BasicStrings.solutions.CommonPrefix_4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommonPrefix_4Test {

    @Test
    void testCommonPrefixExists() {
        String[] str = {"flowers", "flow", "fly", "flight"};
        // Expected common prefix is "fl"
        assertEquals("fl", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testNoCommonPrefix() {
        String[] str = {"apple", "banana", "carrot"};
        // No common prefix, expected result is an empty string
        assertEquals("", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testFullWordAsCommonPrefix() {
        String[] str = {"test", "test", "test"};
        // All words are the same, so the common prefix should be "test"
        assertEquals("test", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testSingleCharacterCommonPrefix() {
        String[] str = {"cat", "car", "can"};
        // Expected common prefix is "ca"
        assertEquals("ca", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testEmptyArray() {
        String[] str = {};
        // Empty array, so the result should be an empty string
        assertEquals("", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testSingleElementArray() {
        String[] str = {"single"};
        // Only one element, so the common prefix is the element itself
        assertEquals("single", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testPrefixOfDifferentLengths() {
        String[] str = {"prefix", "pre", "prepare"};
        // Expected common prefix is "pre"
        assertEquals("pre", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testArrayWithEmptyStrings() {
        String[] str = {"", "empty", "test"};
        // One string is empty, so the common prefix should be an empty string
        assertEquals("", CommonPrefix_4.largeCommonPrefix(str));
    }

    @Test
    void testCommonPrefixWithSpaces() {
        String[] str = {"space test", "space trial", "space"};
        // Expected common prefix is "space"
        assertEquals("space", CommonPrefix_4.largeCommonPrefix(str));
    }
}
