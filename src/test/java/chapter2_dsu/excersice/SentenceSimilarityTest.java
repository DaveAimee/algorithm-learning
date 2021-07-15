package chapter2_dsu.excersice;
import static org.junit.Assert.assertFalse;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class SentenceSimilarityTest {
    SentenceSimilarity s = new SentenceSimilarity();
    // ["I","love","leetcode"]
    // ["I","love","onepiece"]
    // [["manga","hunterXhunter"],["platform","anime"],["leetcode","platform"],["anime","manga"]]
    @Test
    public void testAreSentencesSimilarTwo() {
        String[] sentence1 = {"I", "love", "leetcode"};
        String[] sentence2 = {"I", "love", "onepiece"};
        List<List<String>> similarPairs = new ArrayList<List<String>>();
        List<String> pair1 = new ArrayList<String>();
        pair1.add("manga");
        pair1.add("hunterXhunter");
        List<String> pair2 = new ArrayList<String>();
        pair2.add("platform");
        pair2.add("anime");
        List<String> pair3 = new ArrayList<String>();
        pair3.add("leetcode");
        pair3.add("platform");
        List<String> pair4 = new ArrayList<String>();
        pair4.add("anime");
        pair4.add("manga");
        similarPairs.add(pair1);
        similarPairs.add(pair2);
        similarPairs.add(pair3);
        similarPairs.add(pair4);
        assertFalse(s.areSentencesSimilarTwo(sentence1, sentence2, similarPairs));
    }
}
