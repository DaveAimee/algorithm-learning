package chapter13_greedy.exercise;

import java.util.Arrays;
import java.util.Comparator;
//leetcode452: https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/
public class BurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 1) {
            return 1;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for(int i = 1;i < points.length;i++) {
            if(points[i][0] > pos) {
                pos = points[i][1];
                ans++;
            }
        }
        return ans;
    }
}
