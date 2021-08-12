package Special1_bag_problem.excercise;
//leetcode377: https://leetcode-cn.com/problems/combination-sum-iv/
//important
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        // 因为 nums[i] 最小值为 1，因此构成答案的最大长度为 target
        int len = target;
        int[][] f = new int[len + 1][target + 1];
        f[0][0] = 1;
        int ans = 0;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= target; j++) {
                for (int u : nums) {
                    if (j >= u) f[i][j] += f[i - 1][j - u];
                }
            }
            ans += f[i][target];
        }
        return ans;
    }
}
