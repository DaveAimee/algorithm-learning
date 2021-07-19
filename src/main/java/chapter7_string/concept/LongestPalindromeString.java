package chapter7_string.concept;
//leetcode5 : https://leetcode-cn.com/problems/longest-palindromic-substring/
public class LongestPalindromeString {
    public String longestPalindrome(String s) {
        String res = "";
        int length = s.length();
        for(int i=0;i<length;i++) {
            for(int j=i+1;j<=length;j++) {
                String test = s.substring(i,j);
                if(test.length() > res.length() && isPalindromic(test)) {
                    res = test;
                }
            }
        }
        return res;
    }
    private boolean isPalindromic(String s) {
        int len = s.length();
        int i = 0;
        while(i<=len-i-1) {
            if(s.charAt(i) != s.charAt(len-i-1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
