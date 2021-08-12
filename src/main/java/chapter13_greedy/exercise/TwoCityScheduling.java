package chapter13_greedy.exercise;

import java.util.Arrays;
import java.util.Comparator;
//important
//leetcode1029: https://leetcode-cn.com/problems/two-city-scheduling/
public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new Comparator<int[]>() {
            public int compare(int[] cost1, int[] cost2) {
                int diff1 = cost1[0] - cost1[1];
                int diff2 = cost2[0] - cost2[1];
                if(diff1 > diff2) {
                    return 1;
                }
                else if(diff1 == diff2) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
        int N = costs.length;
        int sum = 0;
        for(int i=0;i<N;i++) {
            if(i<N/2) {
                sum+=costs[i][0];
            }
            else {
                sum+=costs[i][1];
            }
        }
        return sum;
    }
}