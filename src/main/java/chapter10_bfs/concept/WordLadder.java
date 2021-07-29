package chapter10_bfs.concept;


import java.util.LinkedList;
import java.util.List;
//important
//leetcode127: https://leetcode-cn.com/problems/word-ladder/
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer(beginWord); 
        boolean[] marked = new boolean[wordList.size()];
        int layer = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            layer++;
            while(size-->0) {
                String cur = queue.poll();
                for(int i=0;i<wordList.size();i++) {
                    if(marked[i]) {
                        continue;
                    }
                    String dic = wordList.get(i);
                    if(isConvertible(dic, cur)) {
                        if(dic.equals(endWord)) {
                            return layer;
                        }
                        queue.add(dic);
                        marked[i] = true;
                    }
                }
            }
        }
        return 0;
    }    
    private boolean isConvertible(String word1,String word2) {
        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        int diffNums = 0;
        for(int i=0;i<words1.length;i++) {
            if(words1[i]!=words2[i]) {
                diffNums++;
                if(diffNums > 2) {
                    return false;
                }
            }
        }
        if(diffNums==1) {
            return true;
        }
        return false;
    }
    
}
