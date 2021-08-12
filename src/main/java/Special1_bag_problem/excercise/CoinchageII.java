package Special1_bag_problem.excercise;
//leetcode518: https://leetcode-cn.com/problems/coin-change-2/
public class CoinchageII {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0;i<coins.length;i++) {
            for(int v=0;v<amount+1;v++) {
                if(v>=coins[i]) {
                    dp[v] = dp[v] + dp[v-coins[i]];
                }
            }
        }
        return dp[amount];
    }
}
