package chapter2_dsu.excersice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestEquivalentStringTest {
    @Test
    public void testSmallestEquivalentString() {
        SmallestEquivalentString sol = new SmallestEquivalentString();
        assertEquals("aab",sol.smallestEquivalentString("abc", "cde", "eed"));
        assertEquals("makkek",sol.smallestEquivalentString("parker", "morris", "parser"));
    }
}
