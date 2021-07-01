package chapter2_dsu.excersice;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxMinPath {
    private boolean [][] isVisited = null;
    // movX和moveY组成四个方向
    private int[] moveX = {-1,1,0,0};
    private int[] moveY = {0,0,-1,1};
    public int maximumMinimumPath(int[][] grid) {
        this.isVisited = new boolean [grid.length][grid[0].length];
        Deque<Integer> st = new ArrayDeque<>();
        int res = dfs(0, 0, grid, st);
        return res;
    }
    private int dfs(int i, int j, int[][] grid, Deque<Integer> path) {
        if(!isVisited[i][j]) {
            if(i == grid.length -1 && j == grid[0].length -1) {
                path.add(grid[i][j]);
                return path.stream().min(Integer::compareTo).get();
            }
            this.isVisited[i][j] = true;
            //查看四周没有被访问过的找到一个最大的方向进行检索
            int maxX = -1 ,maxY = -1;
            int maxValue = -1;
            for(int k = 0;k < moveX.length;k++) {
                int x = i + moveX[k];
                int y = j + moveY[k];
                if(inArea(grid, x, y) && !isVisited[x][y]) {
                    if(grid[x][y] > maxValue) {
                        maxValue = grid[x][y];
                        maxX = x;
                        maxY = y;
                    }
                }
            }
            path.add(grid[i][j]);
            return dfs(maxX,maxY,grid,path);
        }
        return -1;
    }
    private boolean inArea(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                    && 0 <= c && c < grid[0].length;
    }
}
