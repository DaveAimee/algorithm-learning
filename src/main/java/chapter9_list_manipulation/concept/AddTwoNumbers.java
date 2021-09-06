package chapter9_list_manipulation.concept;


//leetcode2: https://leetcode-cn.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int sum = 0;
        while(l1!=null || l2!=null || sum!=0) {
            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            current.next = new ListNode(sum % 10);
            sum=sum/10;
            current = current.next;
        }
        return dummy.next;
    }
}
