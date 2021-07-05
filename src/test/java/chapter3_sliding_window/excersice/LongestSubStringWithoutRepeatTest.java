package chapter3_sliding_window.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubStringWithoutRepeatTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubStringWithoutRepeat  l = new LongestSubStringWithoutRepeat();
        assertEquals(3,l.lengthOfLongestSubstring("abcabcbb"));
    }
}
