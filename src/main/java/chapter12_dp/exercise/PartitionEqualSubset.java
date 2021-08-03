package chapter12_dp.exercise;
//important
//leetcode416: https://leetcode-cn.com/problems/partition-equal-subset-sum/
public class PartitionEqualSubset {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for(int element: nums) {
            sum += element;
            maxNum = Math.max(maxNum, element);
        }
        if(sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        int N = nums.length;

        //dp[i][j]表示从前i个元素中随机选取数字，是否存在方案使得和为j
        boolean[][] dp = new boolean [N][target+1];
        //initial value
        dp[0][0] = true;
        dp[0][nums[0]] = true;
        for(int i=1;i<N;i++) {
            for(int j=0;j<target+1;j++) {
                //边界条件
                if(j==0) {
                    dp[i][j] = true;
                    continue;
                }
                if(j>=nums[i]) {
                    dp[i][j] = dp[i-1][j-nums[i]] | dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N-1][target];
    }
}