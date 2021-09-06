package chapter4_prefix_sum.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubArraysDivBykTest {
    @Test
    public void testGet() {
        SubArraysDivByk sol = new SubArraysDivByk();
        assertEquals(6, sol.get(2, 4));
        assertEquals(1, sol.get(2, 2));
    }

    @Test
    public void testSubarraysDivByK() {
        SubArraysDivByk sol = new SubArraysDivByk();
        //assertEquals(7, sol.subarraysDivByK(new int[] {4,5,0,-2,-3,1}, 5));
        assertEquals(2, sol.subarraysDivByK(new int[] {-1,2,9}, 2));
    }
}
