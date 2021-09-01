package chapter2_dsu.excersice;

import java.util.Arrays;
import java.util.Comparator;

public class ConnectingCitiesWithMinimumCosts {
    //记录两点是否联通所用的结构
    private int[] parents;
    public int minimumCost(int n, int[][] connections) {
        makeSet(n+1);
        Arrays.sort(connections, new Comparator<int[]>() {
            public int compare(int[] edge1, int[] edge2) {
                if (edge1[2] > edge2[2]) {
                    return 1;
                } else if (edge1[2] < edge2[2]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int edgeNums = 0;
        int cost = 0;
        for(int[] edge:connections) {
            int vertex1 = edge[0];
            int vertex2 = edge[1];
            if(find(vertex1)!=find(vertex2)) {
                unionSet(vertex1, vertex2);
                cost+=edge[2];
                edgeNums++;
                if(edgeNums == n-1) {
                    return cost;
                }
            }
        }
        return edgeNums == n-1? cost:-1;
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
        else {
            parents[find(x)] = find(y);
        }
    }
}
