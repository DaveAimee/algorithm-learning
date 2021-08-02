package chapter12_dp.exercise;
//leetcode198: https://leetcode-cn.com/problems/house-robber/
//动态规划说明：![](https://i.loli.net/2021/07/31/EDRV645xZBLYCzO.png)
public class Rob {
    public int rob(int[] nums) {
        return solve(nums, nums.length -1);
    }
    
    private int solve(int[] nums, int index) {
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],dp[0]);
        for(int k = 2;k<nums.length;k++) {
            dp[k] = Math.max(nums[k] + dp[k-2], dp[k-1]);
        }
        return dp[nums.length -1];
    }
}
