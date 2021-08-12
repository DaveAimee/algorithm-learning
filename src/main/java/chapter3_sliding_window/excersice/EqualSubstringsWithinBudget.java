package chapter3_sliding_window.excersice;
//leetcode1208: https://leetcode-cn.com/problems/get-equal-substrings-within-budget/
public class EqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, right = 0;
        int N = s.length();
        int cost = 0;
        int maxLength = Integer.MIN_VALUE;
        while(right < N) {
            if(s.charAt(right) !=  t.charAt(right)) {
                cost+=Math.abs(t.charAt(right) - s.charAt(right));
            }
            //当cost超出范围的时候
            while(cost > maxCost) {
                if(s.charAt(left) != t.charAt(left)) {
                    cost-=Math.abs(t.charAt(left) - s.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
