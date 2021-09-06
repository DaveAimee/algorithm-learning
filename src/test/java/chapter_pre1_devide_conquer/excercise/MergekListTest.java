package chapter_pre1_devide_conquer.excercise;
import org.junit.Test;

public class MergekListTest {
    @Test
    public void testMergeKLists() {
        MergekList sol = new MergekList();
        ListNode l1 = ListNode.buildList(new int[] {1,4,5});
        ListNode l2 = ListNode.buildList(new int[] {1,3,4});
        ListNode l3 = ListNode.buildList(new int[] {2,6});
        ListNode[] args = new ListNode[] {l1,l2,l3};
        sol.mergeKLists(args);
    }
}
