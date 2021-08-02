package chapter12_dp.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitArrayKPartsTest {
    @Test
    public void testSplitArray() {
        SplitArrayKParts solution = new SplitArrayKParts();
        assertEquals(18, solution.splitArray(new int[] {7,2,5,10,8},2));
    }
}
