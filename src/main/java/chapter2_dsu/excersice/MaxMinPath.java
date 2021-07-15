package chapter2_dsu.excersice;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import chapter2_dsu.concept.Dsu;

public class MaxMinPath {

    class Pair {
        public int x,y;
        public Pair(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
    class Triple {
        public Triple(int i, int j, int k) {
            this.indexX = i;
            this.indexY = j;
            this.value = k;
        }
        public int indexX,indexY,value;
    }
    private boolean [] isVisited = null;
    // movX和moveY组成四个方向
    private int[] moveX = {-1,1,0,0};
    private int[] moveY = {0,0,-1,1};
    public int maximumMinimumPath(int[][] grid) {
        //初始化，将UnionSet和isVisited数组初始化
        int gridNums = grid.length * grid[0].length;
        this.isVisited = new boolean [gridNums];
        Dsu d = new Dsu();
        d.makeSet(gridNums);

        this.isVisited[0] = true;
        this.isVisited[gridNums -1] = true;

        int res = Integer.min(grid[0][0],grid[grid.length -1][grid[0].length -1]);
        List<Pair> pairs = sortByValue(grid);


        for(Pair p : pairs) {
            this.isVisited[p.x * grid[0].length + p.y] = true;
            res = Integer.min(grid[p.x][p.y],res);
            traverse(p.x, p.y,grid,d);
            if(d.find(0) == d.find(gridNums - 1)) {
                return res;
            }
        }
        return res;
    }
    private void traverse(int i, int j,int[][] grid,Dsu d) {
        int newI = -1;
        int newJ = -1;
        int newIndex = -1;
        int oldIndex = i * grid[0].length + j;
        for(int k=0;k<this.moveX.length;k++) {
            newI = i + this.moveX[k];
            newJ = j + this.moveY[k];
            newIndex = newI * grid[0].length + newJ;
            if(inArea(grid, newI, newJ) && this.isVisited[newIndex]) {
                d.unionSet(oldIndex,newIndex);
            }
        }
    }
    private boolean inArea(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                    && 0 <= c && c < grid[0].length;
    }
    private List<Pair> sortByValue(int[][] grid) {
        //第一步： 将数组变成[(index x,index y, value)...]的形式
        Triple [] gridIndex = new Triple[grid.length*grid[0].length];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                gridIndex[i*grid[0].length + j] = new Triple(i,j,grid[i][j]);
            }
        }
        //第二步，对数组进行排序
        Arrays.sort(gridIndex, (a, b) ->  b.value - a.value);
        //第三步：得到对应的按照从大到小排序得到对应的值
        List<Pair> res = new LinkedList<>();
        for(Triple p : gridIndex) {
            res.add(new Pair(p.indexX,p.indexY));
        }
        return res;
    }

}
