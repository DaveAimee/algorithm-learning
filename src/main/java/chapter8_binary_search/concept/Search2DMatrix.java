package chapter8_binary_search.concept;
//leetcode240: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1) {
            return binarySearch(matrix[0], target);
        }
        int startFromRight = matrix[0].length - 1;
        while(matrix[0][startFromRight] > target) {
            startFromRight--;
        }
        //将矩阵进行转置
    }
    public boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
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
        return false;
    }

}
