package chapter2_dsu.excersice;

// leetcode200: https://leetcode-cn.com/problems/number-of-islands/
public class IslandNumber {
    private int[] moveX = {-1, 1, 0, 0};
    private int[] moveY = {0, 0, -1, 1};

    class Union {
        private int[] union;
        private int count = 0;
        private boolean isPathCompressEnabled = true;

        Union(char[][] grid) {
            union = new int[grid.length * grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        int index = i * grid[0].length + j;
                        // 初始化指向自己
                        union[index] = index;
                        this.count++;
                    }
                }
            }
        }

        public int find(int x) {
            if (this.union[x] != x) {
                if (isPathCompressEnabled) {
                    union[x] = find(union[x]);
                }
                return union[x];
            } else {
                return x;
            }
        }

        public void union(int x, int y) {
            // 若两个元素的根元素相同，则两个元素在一个
            if (find(x) == find(y)) {
                return;
            }
            this.union[find(x)] = find(y);
            this.count --;
        }

        public int getSetNums() {
            return this.count;
        }
    }
    public int numIslands(char[][] grid) {
        Union u = new Union(grid);
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0;j < grid[0].length;j++) {
                if(grid[i][j] == '1') {
                    for(int k=0;k<moveX.length;k++) {
                        int x = i + moveX[k];
                        int y = j + moveY[k];
                        if(inArea(grid, x, y)) {
                            if(grid[x][y] == '1') {
                                u.union(i * grid[0].length + j, x * grid[0].length + y);
                            }
                            
                        }
                    }
                }
            }
        }
        return u.getSetNums();
    }
    private boolean inArea(char[][] grid, int r, int c) {
        return 0 <= r && r < grid.length 
                && 0 <= c && c < grid[0].length;
    }
    boolean[][] visited = null;
    public int numIslandsDfsMethod(char[][] grid) {
        int count=0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='1') {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j) {
        if(!visited[i][j] && grid[i][j]=='1') {
           visited[i][j]=true;
           grid[i][j]='0';
           for(int k=0;k<4;k++) {
               int newX = i + moveX[k];
               int newY = j + moveY[k];
               if(inArea(grid, newX, newY)) {
                   dfs(grid,newX,newY);
               }
           }
        }
    }
}
