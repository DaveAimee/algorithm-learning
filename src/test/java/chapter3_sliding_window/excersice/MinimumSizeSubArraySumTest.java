package chapter3_sliding_window.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSizeSubArraySumTest {
    @Test
    public void minSubArrayLenTest() {
        MinimumSizeSubArraySum m = new MinimumSizeSubArraySum();
        int res = m.minSubArrayLen(7, new int [] {2, 3, 1, 2, 4, 3});
        assertEquals(2, res);
    }

    @Test
    public void testMinSubArrayLenMethod2() {
        MinimumSizeSubArraySum sol = new MinimumSizeSubArraySum();
        int res = sol.minSubArrayLenMethod2(7, new int [] {2, 3, 1, 2, 4, 3});
        assertEquals(2, res);
    }
}
