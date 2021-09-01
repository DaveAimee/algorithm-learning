package chapter2_dsu.excersice;
//leetcode261: https://leetcode-cn.com/problems/graph-valid-tree/
public class GraphValidTree {
    private int[] parents = null;
    public boolean validTree(int n, int[][] edges) {
        makeSet(n);
        int countEdges = 0;
        for(int[] edge:edges) {
            if(find(edge[0])!=find(edge[1])) {
                unionSet(edge[0], edge[1]);
                countEdges++;
            }
            else {
                return false;
            }
        }
        return countEdges==n-1? true:false;
    }
    private void makeSet(int maxSize) {
        parents = new int[maxSize];
        for(int i=0;i<maxSize;i++) {
            parents[i] = i;
        }
        return;
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
        else {
            //更改根节点即可
            parents[find(x)] = find(y);
        }
    }
}
