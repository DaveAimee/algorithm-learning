package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountComponentsTest {
    @Test
    public void testCountComponents() {
        CountComponents sol = new CountComponents();
        assertEquals(2, sol.countComponents(5, new int[][] {{0,1},{1,2},{3,4}}));
    }
}
