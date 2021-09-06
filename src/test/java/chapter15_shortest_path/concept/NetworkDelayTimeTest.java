package chapter15_shortest_path.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NetworkDelayTimeTest {
    @Test
    public void testNetworkDelayTime() {
        NetworkDelayTime sol = new NetworkDelayTime();
        assertEquals(2,sol.networkDelayTime(new int[][] {{2,1,1},{2,3,1},{3,4,1}}, 4, 2));
        assertEquals(-1,sol.networkDelayTime(new int[][] {{1,2,1}}, 2, 2));
    }
}
