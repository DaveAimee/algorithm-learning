package chapter11_dfs.concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//leetcode934: https://leetcode-cn.com/problems/shortest-bridge/
public class ShortestBridge {
    //上下左右四个方向
    private int[] moveX = {-1,+1,0,0};
    private int[] moveY = {0,0,-1,+1};
    private boolean[][] marked = null;
    class Pair{
        public int x,y;
        Pair (int x,int y) {
           this.x = x;
           this.y = y;
        }
        @Override 
        public boolean equals(Object st) { 
            Pair temppair= (Pair) st; 
            if (this.x==temppair.x && this.y==temppair.y) return true; 
            else return false; 
        }
        @Override
        public int hashCode() {
            int result = 17;
            result += 31 * ((Integer)this.x).hashCode();
            result += 31 * ((Integer)this.y).hashCode();
            return result;
        }
    }
    public int shortestBridge(int[][] grid) {
        this.marked = new boolean[grid.length][grid[0].length];
        LinkedList<Pair> startPoints = new LinkedList<>();
        //将第一个岛置为2
        label1:
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, i, j, startPoints);
                    break label1;
                }
            }
        }  
        int result = 0;
        result = bfs(grid,startPoints);
        return result;
    }
    private void dfs(int[][] grid,int i,int j,List<Pair> startPoints) {
        if(grid[i][j] == 0) {
            startPoints.add(new Pair(i,j));
            return;
        }
        this.marked[i][j] = true;
        grid[i][j] = 2;
        for(int k = 0;k<this.moveX.length;k++) {
            int newX = i + moveX[k];
            int newY = j + moveY[k];
            if(isValid(grid,newX,newY) && !this.marked[newX][newY]) {
                dfs(grid,newX,newY,startPoints);
            }
        }
    }
    private int bfs(int[][] grid,LinkedList<Pair> initialQueue) {
        LinkedList<Pair> queue = initialQueue;
        Set<Pair> elementsinqueue = new HashSet<>(queue);
        int layer = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            layer++;
            while(size-- > 0) {
                Pair p = queue.poll();
                this.marked[p.x][p.y] = true;
                if(grid[p.x][p.y] == 1) {
                    return layer-1 ;
                }
                for(int k = 0;k<this.moveX.length;k++) {
                    int newX = p.x + moveX[k];
                    int newY = p.y + moveY[k];
                    if(isValid(grid,newX,newY) && !this.marked[newX][newY] && grid[newX][newY] != 2  && !elementsinqueue.contains(new Pair(newX,newY))) {
                        queue.offer(new Pair(newX,newY));
                        elementsinqueue.add(new Pair(newX,newY));
                    }
                }
            }
        }
        return -1;
    }
    private boolean isValid(int[][] grid,int i,int j) {
        return i>=0 && i<grid.length && j>=0 && j<grid[0].length;
    }
}
