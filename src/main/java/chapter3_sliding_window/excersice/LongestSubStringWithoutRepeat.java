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
}