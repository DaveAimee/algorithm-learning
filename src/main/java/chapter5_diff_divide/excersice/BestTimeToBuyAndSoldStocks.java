package chapter5_diff_divide.excersice;
//leetcode121: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSoldStocks {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length==1) {
            return 0;
        }
        int[] diffs = new int[prices.length];
        diffs[0] = -prices[0];
        for(int i=1;i<prices.length;i++) {
            diffs[i] = prices[i] - prices[i-1];
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
        return Integer.max(0, res);
    }
}
