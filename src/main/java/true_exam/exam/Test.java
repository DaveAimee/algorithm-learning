package true_exam.exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {
    //first
    public static boolean solve1(List<int[]> nums) {
        //按照开始时间排序
        //[[1,3],[2,4]]
        Collections.sort(nums, (a,b) -> a[0] - b[0]);
        // int len = nums.length;
        // for(int i=0;i<len-1;i++) {
        //     if(nums[i+1][0] <nums[i][1]) {
        //         return false;
        //     }
        // }
        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
