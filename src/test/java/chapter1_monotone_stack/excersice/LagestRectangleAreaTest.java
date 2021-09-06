package chapter1_monotone_stack.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LagestRectangleAreaTest {
    @Test
    public void testLargestRectangleArea() {
        LargestRectangleArea sol = new LargestRectangleArea();
        assertEquals(10, sol.largestRectangleArea(new int[] {2,1,5,6,2,3}));
    }
}
