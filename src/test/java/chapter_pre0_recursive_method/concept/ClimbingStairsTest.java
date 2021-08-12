package chapter_pre0_recursive_method.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void testClimbStairs() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(2,solution.climbStairs(2));
        assertEquals(3,solution.climbStairs(3));
    }
    @Test
    public void testClimbStairsDp() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(2,solution.climbStairsDp(2));
        assertEquals(3,solution.climbStairsDp(3));
    }
}
