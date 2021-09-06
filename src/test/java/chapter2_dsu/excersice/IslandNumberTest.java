package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IslandNumberTest {
    @Test
    public void testNumIslands() {
        IslandNumber sol = new IslandNumber();
        int result = sol.numIslands(new char [][] {{'1','1','0','0'},{'0','0','1','1'}});
        assertEquals(2, result);
    }
}
