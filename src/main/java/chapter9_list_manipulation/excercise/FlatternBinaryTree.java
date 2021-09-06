package chapter9_list_manipulation.excercise;

import java.util.LinkedList;
import java.util.List;
import chapter9_list_manipulation.concept.*;
//leetcode114: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
public class FlatternBinaryTree {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        traversePreorder(root,list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev = list.get(i - 1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }
    private void traversePreorder(TreeNode root,List<TreeNode> acc) {
        if(root==null) {
            return;
        }
        acc.add(root);
        traversePreorder(root.left, acc);
        traversePreorder(root.right, acc);
    }
}
