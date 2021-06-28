public class Solution { 
    private static class Node { 
        /** 
         * 节点值 
         */ 
        public int value; 
        /** 
         * 左节点 
         */ 
        public Node left; 
        /** 
         * 右节点 
         */ 
        public Node right; 
 
        public Node(int value, Node left, Node right) { 
            this.value = value; 
            this.left = left; 
            this.right = right; 
        } 
    } 
 
    public static void dfs(Node treeNode) { 
        if (treeNode == null) { 
            return; 
        } 
        // 遍历节点 
        process(treeNode) 
        // 遍历左节点 
        dfs(treeNode.left); 
        // 遍历右节点 
        dfs(treeNode.right); 
    } 
    public static void main(String [] args) {
        Node node3 = new Node(3,null,null);
        
        Node root = new Node(0,)
    }
    
} 
