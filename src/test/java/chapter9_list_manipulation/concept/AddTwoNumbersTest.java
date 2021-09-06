package chapter9_list_manipulation.concept;

import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() {
        ListNode node1 = ListNode.buildList(new int[] {2,4});
        ListNode node2 = ListNode.buildList(new int[] {5,6,4});
        AddTwoNumbers sol = new AddTwoNumbers();
        sol.addTwoNumbers(node1, node2);
    }
}
