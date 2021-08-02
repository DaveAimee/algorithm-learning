package chapter12_dp.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobTest {
    @Test
    public void testRob() {
        Rob r = new Rob();
        assertEquals(4,r.rob(new int[] {1,2,3,1}));
    }
}
