package chapter13_greedy.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverlappingIntervalsTest {
    @Test
    public void testEraseOverlapIntervals() {
        OverlappingIntervals solution = new OverlappingIntervals();
        assertEquals(1, solution.eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}}));
    }
}
