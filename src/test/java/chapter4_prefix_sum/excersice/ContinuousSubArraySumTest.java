package chapter4_prefix_sum.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContinuousSubArraySumTest {
    @Test
    public void testCheckSubarraySum() {
        ContinuousSubArraySum c = new ContinuousSubArraySum();

        assertEquals(c.checkSubarraySum(new int[] {23,2,4,6,7}, 6),true);
    }

    @Test
    public void testCheckSubarraySumMethod2() {
        ContinuousSubArraySum c = new ContinuousSubArraySum();
        assertEquals(true, c.checkSubarraySumMethod2(new int[] {5,0,0,0}, 3));
    }
}
