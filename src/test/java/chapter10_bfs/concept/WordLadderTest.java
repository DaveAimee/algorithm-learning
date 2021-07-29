package chapter10_bfs.concept;

import java.util.Arrays;

import org.junit.Test;

public class WordLadderTest {
    @Test
    public void testLadderLength() {
        WordLadder wl = new WordLadder();
        wl.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"));
    }
}
