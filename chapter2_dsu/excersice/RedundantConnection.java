package chapter2_dsu.excersice;

import chapter2_dsu.concept.Dsu;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        Dsu d = new Dsu();
        d.makeset(edges.length + 1);
        for (int arrs[]: edges) {
            if(d.find(arrs[0]) == d.find(arrs[1])) {
                return arrs;
            }
            else {
                d.unionSet(arrs[0], arrs[1]);
            }
        }
        return new int [] {-1,-1};
    }
    public static void main(String[] args) {
        RedundantConnection r = new RedundantConnection();
        r.findRedundantConnection(new int [][] {{1,2},{1,3},{2,3}});
    }
}