package chapter5_diff_divide.excersice;

import java.util.Arrays;

//leetcode1109:https://leetcode.com/problems/corporate-flight-bookings/
public class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int [n];
        for (int [] book:bookings) {
            for(int start = book[0] -1 ;start < book[1]; start++) {
                //start=1
                result[start] += book[2];
            }
        }
        return result;
    }
    //diff Method
    public int[] corpFlightBookingsMethod2(int[][] bookings, int n) {
        int[] bk = new int[n+2];
        for(int[] book:bookings) {
            bk[book[0]]+=book[2];
            bk[book[1]+1]-=book[2];
        }
        for(int i=1;i<=n;i++) {
            bk[i]+=bk[i-1];
        }
        return Arrays.copyOfRange(bk, 1, n+1);
    }
}
