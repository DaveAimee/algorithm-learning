package chapter5_diff_divide.excersice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CorporateFlightBookingsTest {
    @Test
    public void testCorpFlightBookings() {
        CorporateFlightBookings c = new CorporateFlightBookings();
        assertArrayEquals(c.corpFlightBookings(new int[][] {{1,2,10},{2,3,20},{2,5,25}}, 5),new int[] {10,55,45,25,25});
    }
}
