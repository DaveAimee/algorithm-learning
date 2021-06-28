package chapter2_dsu.excersice;

import chapter2_dsu.concept.*;

public class FriendCircle {
    public int findCircleNum(int[][] matrix) {
        Dsu d = new Dsu();
        d.makeset(matrix.length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                if(i < j && matrix[i][j] == 1) {
                    d.unionSet(i, j);
                }
            }
        }
        return d.getSetNums();
    }
    public static void main(String[] args) {
        FriendCircle f = new FriendCircle();
        f.findCircleNum(new int [][] {{1,1,0},{1,1,0},{0,0,1}});
    }
}
