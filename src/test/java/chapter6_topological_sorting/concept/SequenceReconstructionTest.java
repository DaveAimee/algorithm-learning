package chapter6_topological_sorting.concept;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;

public class SequenceReconstructionTest {
    @Test
    public void testSequenceReconstruction() {
        SequenceReconstructionSolution s = new SequenceReconstructionSolution();
        //assertTrue(s.sequenceReconstruction(new int[] {1,2,3},  Arrays.asList(Arrays.asList(1,2),Arrays.asList(1,3),Arrays.asList(2,3))));   
        //assertTrue(s.sequenceReconstruction(new int[] {4,1,5,2,6,3},  Arrays.asList(Arrays.asList(5,2,6,3),Arrays.asList(4,1,5,2))));
        //assertFalse(s.sequenceReconstruction(new int[] {1,2,3},  Arrays.asList(Arrays.asList(1,2),Arrays.asList(1,3))));
        assertEquals(true, s.sequenceReconstruction(new int[] {1}, Arrays.asList(Arrays.asList(1),Arrays.asList(1),Arrays.asList(1))));
        assertEquals(false,s.sequenceReconstruction(new int[] {3,2,1},  Arrays.asList(Arrays.asList(1,2),Arrays.asList(1,3),Arrays.asList(2,3))));
    
    }
}
