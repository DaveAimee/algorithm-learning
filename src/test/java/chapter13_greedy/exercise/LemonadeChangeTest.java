package chapter13_greedy.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LemonadeChangeTest {
    @Test
    public void testLemonadeChange() {
        LemonadeChange solution = new LemonadeChange();
        assertEquals(true,solution.lemonadeChange(new int[] {5,5,5,10,20}));
        assertEquals(true,solution.lemonadeChange(new int[] {5,5,10}));
    }
}
