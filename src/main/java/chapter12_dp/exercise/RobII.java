package chapter12_dp.exercise;

import java.util.Arrays;

//leetcode213: https://leetcode-cn.com/problems/house-robber-ii/
public class RobII {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return 0;
        }
        Rob r = new Rob();
        //打劫第一家
        int result1 = -1;
        result1 = r.rob(Arrays.copyOfRange(nums, 0, nums.length -1));
        int result2 = -1;
        result2 = r.rob(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(result1, result2);
    }
}
