package chapter13_greedy.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BurstBalloonsTest {
    @Test
    public void testFindMinArrowShots() {
        BurstBalloons solution = new BurstBalloons();
        assertEquals(2,solution.findMinArrowShots(new int [][] {{10,16},{2,8},{1,6},{7,12}}));
        assertEquals(2,solution.findMinArrowShots(new int [][] {{-2147483646,-2147483645},{2147483646,2147483647}}));
    }
}
