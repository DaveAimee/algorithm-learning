package chapter13_greedy.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoCitySchedulingTest {
    @Test
    public void testTwoCitySchedCost() {
        TwoCityScheduling solution = new TwoCityScheduling();
        assertEquals(110,solution.twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}}));
    }
}
