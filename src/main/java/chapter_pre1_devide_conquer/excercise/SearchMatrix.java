package chapter_pre1_devide_conquer.excercise;
//leetcode240: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = Math.min(matrix.length, matrix[0].length);
        boolean result = false;
        for(int i=0;i<size;i++) {
            boolean rowResult = false;
            boolean columResult = false;
            //row Search
            int left = 0;
            int right = matrix[0].length-1;
            while(left<=right) {
                int mid = left + (right - left) / 2;
                if(matrix[i][mid]<target) {
                    left = mid + 1;
                }
                else if(matrix[i][mid]==target) {
                    rowResult=true;
                    break;
                }
                else {
                    right = mid -1;
                }
            } 
            //column Search
            left = 0;
            right = matrix.length-1;
            while(left<=right) {
                int mid = left + (right - left) / 2;
                if(matrix[mid][i]<target) {
                    left = mid + 1;
                }
                else if(matrix[mid][i]==target) {
                    columResult=true;
                    break;
                }
                else {
                    right = mid -1;
                }
            } 
            result=rowResult|columResult;
            if(result == true) {
                return result;
            }
        }
        return result;
    }
}
