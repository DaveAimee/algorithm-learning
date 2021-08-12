package chapter13_greedy.concept;

import java.util.Arrays;

//leetcode455: https://leetcode-cn.com/problems/assign-cookies/
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j=0;
        int count = 0;
        while(i<g.length && j<s.length) {
            if(g[i] <= s[j]) {
                i++;
                j++;
                count++;
            }
            else {
                j++;
            }
        }
        return count;
    }
}
