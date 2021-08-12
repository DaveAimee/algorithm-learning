package Special1_bag_problem.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultipleKnapSackTest {
    @Test
    public void testSolve() {
        MultipleKnapSack solution = new MultipleKnapSack();
        assertEquals(7,solution.solve(new int[] {1, 2, 3}, new int[] {5, 9, 7}, new int[] {0,0,1}, 3));
    }
}
