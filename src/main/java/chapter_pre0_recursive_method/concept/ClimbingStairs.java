package chapter_pre0_recursive_method.concept;
//leetcode70: https://leetcode-cn.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public int climbStairsDp(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<n+1;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
