package Special1_bag_problem.excercise;

public class CompleteKnapSack {
    public int solve(int[] costs,int[] values, int volume) {
        int[] dp = new int[volume+1];
        int N = costs.length;
        for(int i=0;i<N;i++) {
            for(int j=0;j<volume+1;j++) {
                if (j>= costs[i]) {
                    dp[j] = Math.max(dp[j], dp[j-costs[i]] + values[i]);
                }
            }
        }
        return dp[volume];
    }
}
