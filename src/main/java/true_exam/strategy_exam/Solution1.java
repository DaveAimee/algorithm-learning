package true_exam.strategy_exam;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
    static int MAX_CHAR=26;
    static boolean checkSubString(String s1,String s2) {
        boolean v[] = new boolean[MAX_CHAR];
        Arrays.fill(v,false);
        for(int i=0;i<s1.length();i++) {
            v[s1.charAt(i) - 'a'] = true;
        }
        for(int i=0;i<s2.length();i++) {
            if(v[s2.charAt(i)-'a']==true) {
                return true;
            }
        }
        return false;
    }
    // Complete the commonSubstring function below.
    static void commonSubstring(List<String> a, List<String> b) {
        for(int i=0;i<a.size();i++) {
            if(checkSubString(a.get(i),b.get(i))) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello,world!");
    }
}
