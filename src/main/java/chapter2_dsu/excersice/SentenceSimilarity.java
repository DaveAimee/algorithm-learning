package chapter2_dsu.excersice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chapter2_dsu.concept.Dsu;

// 题目链接： https://leetcode-cn.com/problems/sentence-similarity-ii/
public class SentenceSimilarity {
    
    public boolean areSentencesSimilarTwo(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1 == null | sentence2 == null) {
            return false;
        }
        if(sentence1.length != sentence2.length) {
            return false;
        }
        Map<String, Integer> maps = new HashMap<String,Integer>();
        int index = 0;
        Dsu d = new Dsu();
        d.makeSet(similarPairs.size()*2);
        for(List<String> pair: similarPairs) {
            int k,v;
            //当集合中不存在相应的string时
            if(!maps.keySet().contains(pair.get(0))) {
                maps.put(pair.get(0), index);
                k = index++;
            }
            else {
                k = maps.get(pair.get(0));
            }

            //当集合中不存在相应的string时
            if(!maps.keySet().contains(pair.get(1))) {
                maps.put(pair.get(1), index);
                v = index++;
            }
            else {
                v = maps.get(pair.get(1));
            }

            d.unionSet(k, v);
        }
        for(int i = 0;i < sentence1.length; i++) {
            // 当句子中包含了没有在相似关系中的单词时直接比较内容
            if (maps.get(sentence1[i]) == null | maps.get(sentence2[i]) == null) {
                if(!sentence1[i].equals(sentence2[i])) {
                    return false;
                }
            }
            else {
                if(d.find(maps.get(sentence1[i])) != d.find(maps.get(sentence2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
