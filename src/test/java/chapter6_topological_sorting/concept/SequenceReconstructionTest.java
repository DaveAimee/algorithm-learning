package chapter6_topological_sorting.concept;

import org.junit.Test;
import java.util.List;
public class SequenceReconstructionTest {
    @Test
    public void testSequenceReconstruction() {
        SequenceReconstruction s = new SequenceReconstruction();
        s.sequenceReconstruction(new int[] {1,2,3},  List.of(List.of(1,2),List.of(1,3)));   
    }
}
