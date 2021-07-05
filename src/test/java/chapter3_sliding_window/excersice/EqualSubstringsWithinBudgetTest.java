package chapter3_sliding_window.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EqualSubstringsWithinBudgetTest {
    @Test
    public void testEqualSubstring() {
        EqualSubstringsWithinBudget eb = new EqualSubstringsWithinBudget();
        assertEquals(3, eb.equalSubstring("abcd", "bcdf", 3));
        assertEquals(1, eb.equalSubstring("abcd", "cdef", 3));
    }
}
