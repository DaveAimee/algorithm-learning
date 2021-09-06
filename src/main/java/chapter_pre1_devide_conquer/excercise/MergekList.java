package chapter_pre1_devide_conquer.excercise;

import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
//leetcode23: https://leetcode-cn.com/problems/merge-k-sorted-lists/
public class MergekList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) {
            return null;
        }
        if(lists.length==1) {
            return lists[0];
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        Comparator<ListNode> comp = new Comparator<ListNode>(){
            @Override
            public int compare(ListNode node1,ListNode node2) {
                if(node1.val<node2.val) {
                    return -1;
                }
                else if (node1.val==node2.val) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        };
        PriorityQueue<ListNode> mypq = new PriorityQueue<>(comp);
        for(ListNode node: lists) {
            if(node!=null) {
                mypq.offer(node);
            }
        }
        while(!mypq.isEmpty()) {
            ListNode node = mypq.poll();
            current.next = node;
            current=current.next;
            if(node.next!=null) {
                mypq.offer(node.next);
            }
        }
        return dummy.next;
    }
}
