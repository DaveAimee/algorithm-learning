package true_exam.strategy_exam;

class Node {
    Node left, right;
    int data;
    Node(int newData) {
        left = right = null;
        data = newData;
    }
}

public class Solution3 {
    private static int isPresent(Node root, int val) {
        if(root==null) {
            return 0;
        }
        if(root.data==val) {
            return 1;
        }
        else if(val>root.data) {
            return isPresent(root.right, val);
        }
        else {
            return isPresent(root.left, val);
        }
    }
    public static void main(String[] args) {
        
    }
}
