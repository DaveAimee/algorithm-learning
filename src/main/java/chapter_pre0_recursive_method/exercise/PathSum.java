package chapter_pre0_recursive_method.exercise;
//leetcode112: https://leetcode-cn.com/problems/path-sum/

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) {
            return false;
        }
        if(root.left==null&&root.right==null) {
            return root.val==targetSum;
        }
        int remain = targetSum - root.val;
        return hasPathSum(root.left,remain) || hasPathSum(root.right,remain);
    }   
}
