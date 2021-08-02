package chapter12_dp.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobIITest {
    @Test
    public void testRob() {
        RobII r2 = new RobII();
        assertEquals(3, r2.rob(new int [] {2,3,2}));
        assertEquals(4, r2.rob(new int [] {1,2,3,1}));
        assertEquals(3, r2.rob(new int [] {1,2,1,1}));
    }
}
