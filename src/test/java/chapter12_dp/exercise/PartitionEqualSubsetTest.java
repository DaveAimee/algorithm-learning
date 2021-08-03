package chapter12_dp.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PartitionEqualSubsetTest {
    @Test
    public void testCanPartition() {
        PartitionEqualSubset solution = new PartitionEqualSubset();
        assertEquals(true,solution.canPartition(new int [] {1,1,2}));
    }
}
