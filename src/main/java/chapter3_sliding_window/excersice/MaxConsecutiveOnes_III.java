package chapter3_sliding_window.excersice;
//important
//leetcode 1004: https://leetcode-cn.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnes_III {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        int left = 0, right = 0;
        int maxLength = Integer.MIN_VALUE;
        int zeros = 0;
        while(right < nums.length) {
            if(nums[right] == 0) {
                zeros++;    
            }
            //当zeros超出限制时
            while(zeros > k) {
                if(nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            //当left=right的时候，长度为一个字符
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}