package chapter12_dp.exercise;

import java.util.Arrays;

//important
//leetcode410: https://leetcode-cn.com/problems/split-array-largest-sum/
public class SplitArrayKParts {
    public int splitArray(int[] nums, int m) {
        //定义dp[i][j]: 数组的前i个元素被分割为j段所能得到的最小值 
        //转移公式见Onenote分析
        int [][] dp = new int[nums.length + 1][m+1];
        //prefixSum[i]表示前i个元素之和
        int[] prefixSum = new int[nums.length + 1];
        for(int i=1;i<prefixSum.length;i++) {
            prefixSum[i]=prefixSum[i-1] + nums[i-1];
        }
        for(int[] row: dp) {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<=Math.min(i,m);j++) {
                for(int k = 0;k<i;k++) {
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[k][j-1],prefixSum[i]-prefixSum[k]));
                }
            }
        }
        return dp[nums.length][m];
    }    
}
