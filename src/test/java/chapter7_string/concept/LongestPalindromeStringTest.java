package chapter7_string.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromeStringTest {
    @Test
    public void testLongestPalindrome() {
        LongestPalindromeString lps = new LongestPalindromeString();
        assertEquals("bb",lps.longestPalindrome("cbbd"));
    }

    @Test
    public void testLongestPalindromeMethod2() {
        LongestPalindromeString sol = new LongestPalindromeString();
        assertEquals("bb",sol.longestPalindromeMethod2("cbbd"));
    }
}
