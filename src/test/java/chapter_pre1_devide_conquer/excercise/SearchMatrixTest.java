package chapter_pre1_devide_conquer.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchMatrixTest {
    @Test
    public void testSearchMatrix() {
        SearchMatrix sol = new SearchMatrix();
        assertEquals(false,sol.searchMatrix(new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 20));
        assertEquals(true,sol.searchMatrix(new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5));
    }
}
