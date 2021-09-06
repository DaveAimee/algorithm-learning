package chapter_pre0_recursive_method.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CellProductionTest {
    @Test
    public void testAllCells() {
        CellProduction sol = new CellProduction();
        assertEquals(4, sol.allCells(3));
    }
}
