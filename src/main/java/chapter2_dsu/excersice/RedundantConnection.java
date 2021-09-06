package chapter2_dsu.excersice;


//leetcode684: https://leetcode-cn.com/problems/redundant-connection/
public class RedundantConnection {
    private int[] parents = null;
    public int[] findRedundantConnection(int[][] edges) {

        makeSet(edges.length + 1);
        for (int arrs[]: edges) {
            if(find(arrs[0]) == find(arrs[1])) {
                return arrs;
            }
            else {
                unionSet(arrs[0], arrs[1]);
            }
        }
        return new int [] {-1,-1};
    }
    private void makeSet(int maxSize) {
        parents = new int[maxSize];
        for(int i=0;i<maxSize;i++) {
            parents[i]=i;
        }
    }
    private int find(int x) {
        if(x==parents[x]) {
            return x;
        }
        else {
            parents[x] = find(parents[x]);
            return parents[x];
        }
    }
    private void unionSet(int x,int y) {
        if(find(x)==find(y)) {
            return;
        }
        int parent_x = find(x);
        int parent_y = find(y);
        parents[parent_x]=parent_y;
    }
    public static void main(String[] args) {
        RedundantConnection r = new RedundantConnection();
        r.findRedundantConnection(new int [][] {{1,2},{1,3},{2,3}});
    }
}