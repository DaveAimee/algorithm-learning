package chapter3_sliding_window.excersice;

//leetcode209: https://leetcode-cn.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right=0;right < nums.length;right++) {
            sum += nums[right];
            while(sum >= target) {
                //当sum比target的值大时将窗口的左侧往右边挪一格
                min = Math.min(min,right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE? 0: min;
    }
}
