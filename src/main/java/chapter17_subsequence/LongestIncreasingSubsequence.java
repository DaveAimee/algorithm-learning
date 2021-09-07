package chapter17_subsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    int[] LIS(int[] arr) {
        int[] dp = new int[arr.length]; //设置数组长度大小的动态规划辅助数组
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1; //i点比j点大，理论上dp要加1
                    //但是可能j不是所需要的最大的，因此需要dp[i] < dp[j] + 1
                    max = max > dp[i] ? max : dp[i]; //找到最大长度
                }
            }
        }
        int[] res = new int[max];
        for(int i = dp.length - 1, j = max; j > 0; i--){ //逆向找
            if(dp[i] == j){ //该点的长度恰好等于res的第j位，即找到了
                j--;
                res[j] = arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
