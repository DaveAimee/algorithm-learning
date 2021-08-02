package chapter12_dp.exercise;
//important
//leetcode1043: https://leetcode-cn.com/problems/partition-array-for-maximum-sum/
public class SplitArrayMaxSum {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int N = arr.length;
        //dp[i]代表前i个元素分割的最大和
        int[] dp = new int[N+1];
        for(int i=0;i<N+1;i++) {
            int j = i-1;
            int max = Integer.MIN_VALUE;
            while((i-j)<=k && j>=0) {
                max = Math.max(max, arr[j]);
                dp[i] = Math.max(dp[i], dp[j] + (i-j) * max);
                j--;
            }
        }
        return dp[N];
    }    
}
