package chapter4_prefix_sum.excersice;

import chapter4_prefix_sum.concept.PrefixSum;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        PrefixSum p = new PrefixSum();
        int [] prefixSum = p.generatePrefixSums(nums);
        int count = 0;
        for(int i=0;i<prefixSum.length - 1;i++) {
            for(int j=i+1; j<prefixSum.length;j++) {
                if(prefixSum[j] - prefixSum[i] == k) {
                    count++;
                } 
            }
        }
        return count;
    }

}
