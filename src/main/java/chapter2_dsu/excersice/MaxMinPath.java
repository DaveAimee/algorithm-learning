package chapter2_dsu.excersice;

import java.util.Queue;

public class MaxMinPath {
    private Boolean [][] isVisited = null;
    // movX和moveY组成四个方向
    private int[] moveX = {-1,1,0,0};
    private int[] moveY = {0,0,-1,1};
    public int maximumMinimumPath(int[][] grid) {
        this.isVisited = new Boolean[grid.length][grid[0].length];
        
    }
    private void dfs(int i, int j, int[][] grid, Queue<Integer> path) {
        if(!isVisited[i][j]) {
            if(i == grid.length -1 && j == grid[0].length -1) {
                path.
            }
            this.isVisited[i][j] = true;
            //查看四周没有被访问过的找到一个最大的方向进行检索
            int maxX = -1 ,maxY = -1;
            int maxValue = -1;
            for(int k = 0;k < moveX.length;k++) {
                int x = i + moveX[k];
                int y = j + moveY[k];
                if(inArea(grid, x, y)) {
                    if(grid[x][y] > maxValue) {
                        maxValue = grid[x][y];
                        maxX = x;
                        maxY = y;
                    }
                }
            }
            path.add(grid[i][j]);
            dfs(maxX,maxY,grid,path);
        }
        
    }
    private boolean inArea(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length
                    && 0 <= c && c < grid[0].length;
    }
}
