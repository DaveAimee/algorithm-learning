package chapter3_sliding_window.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnes_IIITest {
    @Test
    public void testLongestOnes() {
        MaxConsecutiveOnes_III m = new MaxConsecutiveOnes_III();
        assertEquals(6, m.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
