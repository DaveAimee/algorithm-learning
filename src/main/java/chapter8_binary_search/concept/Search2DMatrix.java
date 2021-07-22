package chapter8_binary_search.concept;
//leetcode240: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1) {
            return binarySearch(matrix[0], target);
        }
        int startFromRight = matrix[0].length - 1;
        while(startFromRight>=0 &&matrix[0][startFromRight] > target) {
            startFromRight--;
        }
        //如果startFromRight==-1说明没有target
        if(startFromRight==-1) {
            return false;
        }
        //将矩阵进行转置
        int [][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        boolean result = false;
        //在前startFromRight个子数组中寻找target
        for(int i=0;i<=startFromRight;i++) {
            result |= binarySearch(newMatrix[i], target);
        }
        return result;
    }
    public boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left<=right) {
            int mid = left + ((right - left) >> 1);
            if(nums[mid] == target) {
                return true;
            }
            else if(nums[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
}
