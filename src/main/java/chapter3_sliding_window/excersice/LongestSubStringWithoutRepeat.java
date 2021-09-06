package chapter3_sliding_window.excersice;

import java.util.HashSet;
import java.util.Set;
//leetcode3: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
public class LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        Set<Character> charSets = new HashSet<>();
        int i = 0,j = 0;
        int maxLength = Integer.MIN_VALUE;
        while(i < s.length() && j < s.length() && i <= j) {
            if(!charSets.contains(s.charAt(j))) {
                charSets.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j-i);
            }
            else {
                charSets.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringMethod2(String s) {
        if(s==null || s.equals("")) {
            return 0;
        }
        Set<Character> charSet = new HashSet<>();
        int i=0;
        int j=0;
        int max_len = Integer.MIN_VALUE;
        while(i<=j && j<s.length()) {
            if(!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                max_len=Math.max(max_len,j-i);
            }
            else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return max_len==Integer.MIN_VALUE?1:max_len;
    }
}