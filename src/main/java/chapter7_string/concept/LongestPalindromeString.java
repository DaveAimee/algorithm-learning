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
    public String longestPalindromeMethod2(String s) {
        int N = s.length();
        boolean[][] dp = new boolean[N][N];
        //initial 
        int max_len = -1;
        int i_correct = -1;
        int j_correct = -1;
        for(int i=0;i<dp.length;i++) {
            dp[i][i] = true;
            max_len=1;
            i_correct=i;
            j_correct=i;
        }

        for(int L = 2;L<=N;L++) {
            for(int i=0;i<N-L+1;i++) {
                int j = i+L-1;
                boolean result = false;
                if(s.charAt(i)!=s.charAt(j)) {
                    result=false;
                }
                else {
                    if(L==2) {
                        result=true;
                    }
                    else {
                        result=dp[i+1][j-1];
                    }
                    
                }
                dp[i][j]=result;
                if(result==true) {
                    if(L>max_len) {
                        max_len=L;
                        i_correct=i;
                        j_correct=j;
                    }                    
                }
            }
        }
        return s.substring(i_correct, j_correct+1);
    }
}
