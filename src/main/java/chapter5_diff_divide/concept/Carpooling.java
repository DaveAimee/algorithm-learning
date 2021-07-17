package chapter5_diff_divide.concept;
//leetcode1094: https://leetcode.com/problems/car-pooling/
public class Carpooling {
    public boolean carPooling(int[][] trips, int capacity) {
        //d用来存放相应的距离存在的乘客的数目
        int[] d = new int[1001];
        for(int i=0; i<trips.length;i++) {
            d[trips[i][1]] += trips[i][0];
            d[trips[i][2]] -= trips[i][0];
        }
        int count = d[0];
        if(count > capacity) {
            return false;
        }
        for(int i=1;i<=1000;i++) {
            count += d[i];
            if(count > capacity) {
                return false;
            }
        }
        return true;
    }
}
