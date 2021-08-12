package Special1_bag_problem.excercise;

public class MultipleKnapSack {
    public int solve(int[] costs,int[] values, int[] numbers,int volume) {
        int[] dp = new int[volume+1];
        int N = costs.length;
        for(int i=0;i<N;i++) {
            for(int v=volume;v>=0;v--) {
                for(int k=0;k<=numbers[i];k++) {
                    if(v-k*costs[i]>=0) {
                        dp[v] = Math.max(dp[v], dp[v-k*costs[i]] + k*values[i]);
                    }
                }
            }
        }
        return dp[volume];
    }
}
