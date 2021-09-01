package true_exam.alibaba;

import java.util.PriorityQueue;

public class Solution2 {
    public static int[] solve(int[] saleNums,int k) {
        PriorityQueue<Integer> mypq = new PriorityQueue<>((a,b) -> b - a);
        for(int i=0;i<saleNums.length;i++) {
            mypq.offer(saleNums[i]);
        }
        int[] resultNum = new int[k];
        for(int i=0;i<k;i++) {
            resultNum[i] = mypq.poll();
        }
        return resultNum;
    }
    public static void main(String[] args) {
        solve(new int[] {6,5,4,3,2,1},3);
    }
}
