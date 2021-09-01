package true_exam.alibaba;

import java.util.Arrays;

public class Solution1 {
    public static int[] solve(int[] nums,int target) {
        int size = nums.length;
        int[] prefixSum = new int[size+1];
        for(int i=0;i<size;i++) {
            prefixSum[i+1] = nums[i] + prefixSum[i];
        }

        for(int i=0;i<size;i++) {
            for(int j=i;j<size;j++) {
                int sum = prefixSum[j+1] - prefixSum[i];
                if(sum == target) {
                    int [] resultArray = Arrays.copyOfRange(nums, i, j+1);
                    return resultArray;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        solve(new int[] {9,5,4,8,9,1}, 17).toString();
    }
}
