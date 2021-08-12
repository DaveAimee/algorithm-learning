package true_exam.Jan23;
/**
 * 有多个展厅，每个展厅会限制相同的人数limit,展厅报名的人数可能不一样，所有报名的人数组成一个数组，
 * 所有报名人数之和不能超过cnt,输出展厅的限制人数limit。
 * 当报名总人数小于限制总人数，则返回-1
 * 比如：
 * nums = {1,4,2,5,5,1,6}
 * cnt = 13
 * 输出 limit = 2
 * 因为：1+2+2+2+2+1+2 = 12小于13
 * 
 * 比如：
 * nums = {1,1,5,1}
 * cnt = 7
 * 输出: 2 1+1+2+1 = 4小于7
 */
public class ExhibitionSolution {
    public static void main(String[] args) {
        int[] nums = {90000000, 90000000, 90000000, 90000000,90000000,90000000,90000000};
        int cnt = 90000000;
        System.out.println(managerTourlist(nums,cnt));
    }
    public static int managerTourlist(int[] nums,int cnt) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int length = nums.length;
        long count = 0;
        for(int i=0;i<length;i++) {
            count+= nums[i];
        }
        //总人数小于等于cnt不做限制
        if(count <= cnt) {
            return -1;
        }
        long avg = cnt/length;
        if (avg == 0) {
            return 0;
        }
        long left = avg;
        long right = cnt;
        while(left < right) {
            //二分法
            long mid = left + (right - left + 1)/2;
            count = newCount(nums,mid);
            if(count <= cnt) {
                left = mid;
            }
            else {
                right = mid-1;
            }
        }
        return new Long(left).intValue();
    }
    private static long newCount(int[] nums, long avg) {
        long count = 0;
        for(int i=0;i<nums.length;i++) {
            count += nums[i] >= avg? avg:nums[i];
        }
        return count;
    }
}

