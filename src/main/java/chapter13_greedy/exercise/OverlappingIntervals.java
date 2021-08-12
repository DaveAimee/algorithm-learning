package chapter13_greedy.exercise;

import java.util.Arrays;

//leetcode435: https://leetcode-cn.com/problems/non-overlapping-intervals/
public class OverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int N = intervals.length;
        Arrays.sort(intervals,(v1,v2) -> v1[1] -v2[1]);
        int right = intervals[0][1];
        int ans = 1;
        for(int i=1;i<N;i++) {
            if(intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }
        return N - ans;
    }
}
