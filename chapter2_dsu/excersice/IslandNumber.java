package chapter2_dsu.excersice;

import chapter2_dsu.concept.Dsu;

public class IslandNumber {
    public int numIslands(char[][] grid) {
        Dsu d = new Dsu();
        int nums = grid.length * grid[0].length;
        d.makeset(nums);
        
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
