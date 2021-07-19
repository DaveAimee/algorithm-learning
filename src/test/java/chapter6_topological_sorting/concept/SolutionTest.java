package chapter6_topological_sorting.concept;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSequenceReconstruction() {
        Solution s = new Solution();
        assertEquals(true, s.sequenceReconstruction(new int[] {1,2,3,4,5}, Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(1,2,3,4),Arrays.asList(1,2,3),Arrays.asList(1),Arrays.asList(4),Arrays.asList(5))));
    }
}
