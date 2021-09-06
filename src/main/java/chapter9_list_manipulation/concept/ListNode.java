package chapter9_list_manipulation.concept;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode buildList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for(int i=0;i<nums.length;i++) {
            current.next = new ListNode(nums[i]);
            current=current.next;
        }
        return dummy.next;
    }
}
