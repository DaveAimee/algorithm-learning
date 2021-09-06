package chapter4_prefix_sum.excersice;

import java.util.HashMap;
import java.util.Map;

import chapter4_prefix_sum.concept.PrefixSum;

//leetcode523: https://leetcode-cn.com/problems/continuous-subarray-sum/
public class ContinuousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        PrefixSum p = new PrefixSum();
        int[] prefixSum = p.generatePrefixSums(nums);
        for (int i = 0; i < prefixSum.length - 1; i++) {
            for (int j = i + 1; j < prefixSum.length; j++) {
                if (j - i >= 2 && (prefixSum[j] - prefixSum[i]) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkSubarraySumMethod2(int[] nums, int k) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        Map<Integer, Integer> dict = new HashMap<>();
        dict.put(0%k, 0);
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            int remain = prefixSum[i + 1] % k;
            if (dict.containsKey(remain) && (i + 1 - dict.get(remain) >= 2)) {
                return true;
            }
            //只存放第一次的index
            if (!dict.containsKey(remain)){
                dict.put(remain, i + 1);
            }
        }
        return false;
    }
}
