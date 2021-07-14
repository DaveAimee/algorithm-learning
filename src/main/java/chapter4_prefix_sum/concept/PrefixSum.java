package chapter4_prefix_sum.concept;

import java.util.Arrays;

public class PrefixSum {
    public int[] generatePrefixSums(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for(int i=0;i<nums.length;i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        PrefixSum p = new PrefixSum();
        int[] result = p.generatePrefixSums(new int[] {1,2,3,4,5,6,7});
        System.out.println(Arrays.toString(result));
    }
}