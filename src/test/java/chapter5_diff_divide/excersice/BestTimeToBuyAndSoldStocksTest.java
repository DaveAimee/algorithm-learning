package chapter5_diff_divide.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSoldStocksTest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSoldStocks b = new BestTimeToBuyAndSoldStocks();
        assertEquals(b.maxProfit(new int[] {7,1,5,3,6,4}),5);
    }
}
