package true_exam.Jan23;
//MWCS展厅
public class Solution3 {
    public int manageTourists(int[] nums, int cnt) {
        
        int MaxLimit = -1;
        int sum = 0;
        boolean isOverflow = false;
        for(int element:nums) {
            if(element>MaxLimit) {
                MaxLimit = element;
            }
            sum += element;
            if(sum < 0) {
                isOverflow = true;
            }
        }
        if(isOverflow==false && sum < cnt) {
            return -1;
        }
        //使用二分法搜索合适的值
        int res = binarySearch(nums,MaxLimit,cnt);
        return res;
    }
    private int binarySearch(int[] nums,int MaxLimit,int cnt) {
        long left = 0;
        long right = MaxLimit;
        long mid = -1;
        while(left<=right) {
            mid = left + ((right - left + 1)>>1);
            while (mid < 0) {
                long temp1 = (right - left + 1)>>1;
                long temp2 = left;
                mid = temp1 + temp2;
            }
            if(isOk(nums, (int)mid, cnt)) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return (int)mid;
    }
    private boolean isOk(int[] nums,int testLimit,int cnt) {
        int sum = 0;
        for(int n:nums) {
            sum+=n < testLimit? n:testLimit;
            if(sum<0) {
                return false;
            }
        }
        return sum<=cnt;
    }
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int test = (int) Math.pow((double)10.0, (double)9.0);
        //System.out.println(s.manageTourists(new int [] {1,4,2,5,5,1,6}, 13));
        //System.out.println(s.manageTourists(new int [] {1,3,2,1}, 197));
        //System.out.println(s.manageTourists(new int [] {1,1}, 1));
        System.out.println(s.manageTourists(new int [] {Integer.MAX_VALUE,Integer.MAX_VALUE,2}, Integer.MAX_VALUE));
    }
}
