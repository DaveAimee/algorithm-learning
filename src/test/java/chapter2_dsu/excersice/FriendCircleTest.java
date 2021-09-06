package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FriendCircleTest {
    @Test
    public void testFindCircleNum() {
        ProvinceNum f = new ProvinceNum();
        assertEquals(2,f.findCircleNum(new int [][] {{1,1,0},{1,1,0},{0,0,1}}));
    }
}
