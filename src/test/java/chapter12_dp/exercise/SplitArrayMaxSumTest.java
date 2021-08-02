package chapter12_dp.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitArrayMaxSumTest {
    @Test
    public void testMaxSumAfterPartitioning() {
        SplitArrayMaxSum sam = new SplitArrayMaxSum();
        assertEquals(84,sam.maxSumAfterPartitioning(new int[] {1,15,7,9,2,5,10}, 3));
    }
}
