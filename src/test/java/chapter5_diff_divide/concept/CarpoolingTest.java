package chapter5_diff_divide.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarpoolingTest {
    @Test
    public void testCarPooling() {
        Carpooling c = new Carpooling();
        assertEquals(c.carPooling(new int [][] {{2,1,5},{3,3,7}}, 4),false);
    }
}
