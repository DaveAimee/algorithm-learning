package chapter13_greedy.concept;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssignCookiesTest {
    @Test
    public void testFindContentChildren() {
        AssignCookies solution = new AssignCookies();
        assertEquals(1,solution.findContentChildren(new int [] {1, 2, 3}, new int [] {1, 1}));
        assertEquals(2,solution.findContentChildren(new int [] {1, 2}, new int [] {1, 2, 3}));
    }
}
