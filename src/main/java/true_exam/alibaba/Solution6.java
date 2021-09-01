package true_exam.alibaba;

import java.util.Arrays;

public class Solution6 {
    public static int solveOnce(int[] nums) {
        int[] diffs = new int[nums.length];
        //先做差分数组
        diffs[0] = -nums[0];
        for(int i=1;i<nums.length;i++) {
            diffs[i] = nums[i] - nums[i-1];
        }
        //使用动态规划求解diffs数组中最大子数组和
        //dp[i]代表以元素diffs[i]结尾的最大子数组和
        //dp[i] = max(diffs[i],dp[i-1] + diffs[i])
        int[] dp = new int[diffs.length];
        dp[0] = diffs[0];
        int res = Integer.MIN_VALUE;
        for(int i=1;i<dp.length;i++) {
            dp[i] = Integer.max(diffs[i],dp[i-1] + diffs[i]);
            res = Integer.max(res, dp[i]);
        }
        return Integer.max(0,res);
    }
    public static int solveTwice(int[] nums) {
        int size = nums.length;
        int totalSum = Integer.MIN_VALUE;
        for(int i=1;i<size;i++) {
            int[] frontPart = Arrays.copyOfRange(nums, 0, i);
            int[] tailPart = Arrays.copyOfRange(nums, i, size);
            int sum1 = solveOnce(frontPart);
            int sum2 = solveOnce(tailPart);
            totalSum=Integer.max(totalSum, sum1+sum2);
        }
        return Integer.max(0,totalSum);
    }
    public static void main(String[] args) {
        System.out.println(solveTwice(new int[] {5, 3, 8, 18, 11, 12, 15}));
    }
}
