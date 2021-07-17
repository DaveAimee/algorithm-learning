package chapter4_prefix_sum.excersice;

import chapter4_prefix_sum.concept.PrefixSum;
//leetcode523: https://leetcode-cn.com/problems/continuous-subarray-sum/
public class ContinuousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        PrefixSum p = new PrefixSum();
        int[] prefixSum = p.generatePrefixSums(nums);
        for(int i=0;i<prefixSum.length - 1;i++) {
            for(int j=i+1; j<prefixSum.length;j++) {
                if(j - i >= 2 && (prefixSum[j] - prefixSum[i] )% k == 0) {
                    return true;
                } 
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}


