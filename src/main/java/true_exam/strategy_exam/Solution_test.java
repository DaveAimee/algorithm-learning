package true_exam.strategy_exam;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class Solution_test {
    public ArrayList<ArrayList<Integer>> levelOrderBottom (TreeNode root) {
        // write code here
        if(root==null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            while(size-->0) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
            result.add(temp);
        }
        return reverse(result);
    }
    private ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> res) {
        ArrayList<ArrayList<Integer>> newRes = new ArrayList<ArrayList<Integer>>();
        int size = res.size();
        for(int i=size-1;i>=0;i--) {
            newRes.add(res.get(i));
        }
        return newRes;
    }
    public static void main(String[] args) {
        TreeNode temp15 = new TreeNode();
        TreeNode temp7 = new TreeNode();
        TreeNode temp20 = new TreeNode();
        TreeNode temp9 = new TreeNode();
        TreeNode temp3 = new TreeNode();
        temp15.val = 15;
        temp7.val = 7;
        temp20.val = 20;
        temp9.val = 9;
        temp3.val = 3;
        temp3.left=temp9;
        temp3.right=temp20;
        temp20.left=temp15;
        temp20.right=temp7;
        Solution_test sol = new Solution_test();
        sol.levelOrderBottom(temp3);
    }
}
