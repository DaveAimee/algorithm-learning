package Special1_bag_problem.excercise;
public class ZeroOneKnapSack{
    public int solve(int[] costs,int[] values, int volume) {
        int N = costs.length;
        // dp[i][j]表示前i件物品重量不超过j的最大值
        int[][] dp = new int[N+1][volume+1];
        for(int i=1;i<N+1;i++) {
            for(int v=0;v<volume+1;v++) {
                dp[i][v] = v >= costs[i-1] ? Math.max(dp[i-1][v], dp[i-1][v-costs[i-1]] + values[i-1]): dp[i-1][v];
            }
        }
        return dp[N][volume];
    }
    public int solve1D(int[] costs,int[] values, int volume) {
        int N = costs.length;
        int[] dp = new int [volume+1];
        for(int i=1;i<N+1;i++) {
            for(int v=volume;v>=0;v--) {
                if(v>=costs[i-1]) {
                    dp[v] = Math.max(dp[v],dp[v-costs[i-1]]+values[i-1]);
                }
            }
        }
        return dp[volume];
    }
}