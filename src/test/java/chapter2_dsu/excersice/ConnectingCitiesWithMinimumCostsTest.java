package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConnectingCitiesWithMinimumCostsTest {
    @Test
    public void testMinimumCost() {
        ConnectingCitiesWithMinimumCosts sol = new ConnectingCitiesWithMinimumCosts();
        assertEquals(6,sol.minimumCost(3, new int[][] {{1,2,5},{1,3,6},{2,3,1}}));
        assertEquals(-1,sol.minimumCost(4, new int[][] {{1,2,3},{3,4,4}}));
    }
}
