package chapter2_dsu.excersice;
import java.util.HashSet;
import java.util.Set;

//leetcode547: https://leetcode-cn.com/problems/number-of-provinces/
public class ProvinceNum {
    int[] parents = null;
    public int findCircleNum(int[][] matrix) {
        makeSet(matrix.length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                if(i < j && matrix[i][j] == 1) {
                    unionSet(i, j);
                }
            }
        }
        return countRoot();
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
    private int countRoot() {
        Set<Integer> myset = new HashSet<>();
        for(int i=0;i<parents.length;i++) {
            myset.add(find(parents[i]));
        }
        return myset.size();
    }
    public static void main(String[] args) {
        ProvinceNum f = new ProvinceNum();
        f.findCircleNum(new int [][] {{1,1,0},{1,1,0},{0,0,1}});
    }
}
