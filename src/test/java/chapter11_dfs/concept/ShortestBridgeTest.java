package chapter11_dfs.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestBridgeTest {
    @Test
    public void testShortestBridge() {
        ShortestBridge s = new ShortestBridge();
        assertEquals(2, s.shortestBridge(new int[][] {{0,1,0},{0,0,0},{0,0,1}}));
        assertEquals(1, s.shortestBridge(new int[][] {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}}));
    }
}
