package Special1_bag_problem.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CombinationSumIVTest {
    @Test
    public void testCombinationSum4() {
        CombinationSumIV solution = new CombinationSumIV();
        assertEquals(7,solution.combinationSum4(new int [] {1,2,3}, 4));
    }
}
