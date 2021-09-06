package chapter4_prefix_sum.excersice;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//leetcode974: https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/
public class SubArraysDivByk {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        Map<Integer, List<Integer>> dict = new HashMap<>();
        dict.put(0%k, new LinkedList<Integer>(){{
            add(0);
        }});
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            int remain = prefixSum[i + 1]%k < 0?(prefixSum[i + 1]%k+k):prefixSum[i + 1]%k ;
            //只存放第一次的index
            if (!dict.containsKey(remain)){
                List<Integer> temp = new LinkedList<>();
                temp.add(i+1);
                dict.put(remain, temp);
            }
            else {
                dict.get(remain).add(i+1);
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry: dict.entrySet()) {
            if(entry.getValue().size()>1) {
                count+=get(2, entry.getValue().size());
            }
        }
        return count;
    }
    //排列组合
    public int get(int m,int n){
        int res=1;
        for(int i=0;i<m;i++){
            res = res*(n-i)/(i+1);  
        }
        return res;    
    }
}
