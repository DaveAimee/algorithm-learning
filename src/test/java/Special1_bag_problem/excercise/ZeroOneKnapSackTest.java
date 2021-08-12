package Special1_bag_problem.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZeroOneKnapSackTest {
    @Test
    public void testSolve() {
        ZeroOneKnapSack solution = new ZeroOneKnapSack();
        assertEquals(24, solution.solve(new int [] {3, 4, 7, 8, 9}, new int[] {4, 5, 10, 11, 13}, 17));
        assertEquals(14,solution.solve(new int [] {1,2,3}, new int [] {5,9,7}, 3));
        assertEquals(24, solution.solve1D(new int [] {3, 4, 7, 8, 9}, new int[] {4, 5, 10, 11, 13}, 17));
        assertEquals(14,solution.solve1D(new int [] {1,2,3}, new int [] {5,9,7}, 3));
    }
}
