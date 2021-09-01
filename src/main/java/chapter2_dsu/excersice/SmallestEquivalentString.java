package chapter2_dsu.excersice;
//leetcode1061: https://leetcode-cn.com/problems/lexicographically-smallest-equivalent-string/
public class SmallestEquivalentString {
    private int[] parents = null;
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        makeSet();
        int len = s1.length();
        for(int i=0;i<len;i++) {
            unionSet(charToNum(s1.charAt(i)), charToNum(s2.charAt(i)));
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<baseStr.length();i++) {
            char temp = numberToChar(find(charToNum(baseStr.charAt(i))));
            result.append(temp);
        }
        return result.toString();
    }
    private int charToNum(char c) {
        return (int)(c - 'a');
    }
    private char numberToChar(int num) {
        return (char)(97+num);
    }
    private void makeSet() {
        parents = new int[26];
        for(int i = 0;i<26;i++){
            parents[i] = i;
        }
    }
    private int find(int x) {
        if(parents[x]!=x) {
            parents[x] = find(parents[x]);
            return parents[x];
        }
        else {
            return x;
        }
    }
    private void unionSet(int x, int y) {
        //fix bug
        int parent_x = find(x);
        int parent_y = find(y);
        if(parent_x==parent_y) {
            return;
        }
        else {
            if(parent_x<parent_y) {
                parents[parent_y] = parent_x; 
            }
            else {
                parents[parent_x] = parent_y; 
            }
        }
    }
    public static void main(String[] args) {
        SmallestEquivalentString sol = new SmallestEquivalentString();
        sol.makeSet();
        sol.unionSet(0, 2);
        System.out.println(sol.find(2));
        sol.unionSet(1, 3);
        System.out.println(sol.find(3));
        sol.unionSet(2, 4);
        System.out.println(sol.find(4));
        sol.smallestEquivalentString("abc", "cde", "eed");
    }
}
