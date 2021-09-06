package chapter_pre0_recursive_method.concept;
//leetcode10-11:https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/https:/leetcode-cn.com/problems/climbing-stairs/
public class ClimbingStairsII {
    public int numWays(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<n+1;i++) {
            dp[i] = (dp[i-1] + dp[i-2])%1000_0000_07;
        }
        return dp[n];
    }
}
