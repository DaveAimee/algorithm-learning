package Special1_bag_problem.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompleteKnapSackTest {
    @Test
    public void testSolve() {
        CompleteKnapSack solution = new CompleteKnapSack();
        assertEquals(15, solution.solve(new int[] {1, 2, 3}, new int[] {5, 9, 7}, 3));
    }
}
