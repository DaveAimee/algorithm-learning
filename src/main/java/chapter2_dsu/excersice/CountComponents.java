package chapter2_dsu.excersice;

import java.util.HashSet;
import java.util.Set;

//leetcode323: https://leetcode-cn.com/problems/number-of-connected-components-in-an-undirected-graph/
public class CountComponents {
    private int[] parents = null;
    public int countComponents(int n, int[][] edges) {
        makeSet(n);
        for(int[] edge: edges) {
            unionSet(edge[0], edge[1]);
        }
        int res = countRoot();
        return res;
    }    
    private void makeSet(int maxSize) {
        parents = new int[maxSize];
        for(int i=0;i<maxSize;i++) {
            parents[i] = i;
        }
    }
    private int find(int x) {
        if(parents[x]==x) {
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
        parents[parent_x] = parent_y; 
    }
    private int countRoot() {
        Set<Integer> myset = new HashSet<>();
        for(int i=0;i<parents.length;i++) {
            myset.add(find(parents[i]));
        }
        return myset.size();
    }
}
