package chapter9_list_manipulation.excercise;
import chapter9_list_manipulation.concept.*;
//leetcode19: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode first = head;
        ListNode second = dummy;
        while(n-->0) {
            first=first.next;
        }
        while(first!=null) {
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }
}
