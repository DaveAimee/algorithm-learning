public class Dfs {

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
    private void process(Node n) {
        System.out.println("->" + n.value);
    }
    private void dfs(Node root) {
        process(root);
        dfs(root.left);
        dfs(root.right);
    }
    public static void main() {
        //Test code here
        Node left = new Node(1,NULL,NULL);
        Node right = new Node(2,NULL,NULL);
        Node n = new Node(0,left,right);
    }
}