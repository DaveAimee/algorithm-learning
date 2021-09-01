package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GraphValidTreeTest {
    @Test
    public void testValidTree() {
        GraphValidTree sol = new GraphValidTree();
        assertEquals(true,sol.validTree(5, new int[][] {{0,1},{0,2},{0,3},{1,4}}));
    }
}
