package chapter8_binary_search.concept;

import org.junit.Test;

public class Search2DMatrixTest {
    @Test
    public void testSearchMatrix() {
        Search2DMatrix s = new Search2DMatrix();
        s.searchMatrix(new int [][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
    }
}