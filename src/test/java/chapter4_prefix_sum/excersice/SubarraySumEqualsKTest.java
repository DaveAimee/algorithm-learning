package chapter4_prefix_sum.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubarraySumEqualsKTest {
    @Test
    public void testSubarraySum() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        assertEquals(s.subarraySum(new int[] {1, 1, 1}, 2),2);
    }
}
