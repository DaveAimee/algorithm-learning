package chapter1_monotone_stack.concept;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DailyTemperatureTest {
    @Test
    public void testDailyTemperatures() {
        DailyTemperature sol = new DailyTemperature();
        assertArrayEquals(new int[] {1,1,4,2,1,1,0,0} ,sol.dailyTemperatures(new int[] {73,74,75,71,69,72,76,73}));
    }
}
