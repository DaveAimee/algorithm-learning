package chapter_pre1_devide_conquer.excercise;

import java.util.HashMap;
import java.util.Map;
//leecode169: https://leetcode-cn.com/problems/majority-element/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> dict = new HashMap<>();
        int N = nums.length;
        for(int i=0;i<N;i++) {
            if(dict.get(nums[i])==null) {
                dict.put(nums[i], 1);
            }
            else {
                dict.put(nums[i], dict.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:dict.entrySet()) {
            if(entry.getValue()>N/2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
