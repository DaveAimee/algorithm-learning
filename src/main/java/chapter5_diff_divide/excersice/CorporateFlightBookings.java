package chapter5_diff_divide.excersice;
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
}
