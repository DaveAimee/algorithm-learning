package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxMinPathTest {
    MaxMinPath m = new MaxMinPath();
    @Test
    public void maximumMinimumPathTest () {
        assertEquals(4,m.maximumMinimumPath(new int [][] {{5,4,5},{1,2,6},{7,4,6}}));
        assertEquals(2,m.maximumMinimumPath(new int [][] {{2,2,1,2,2,2},{1,2,2,2,1,2}}));
        assertEquals(2,m.maximumMinimumPath(new int [][] {{2,0,2,3,1},{0,2,2,3,3},{2,3,0,2,3},{1,1,2,3,1},{2,2,0,0,1}}));
    }
}
