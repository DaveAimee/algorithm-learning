package true_exam.strategy_exam;

public class Solution_test2 {
    //method1
    private static void solve(int num,int k) {
        Double value = 1.0/num;
        String temp = Double.toString(value);
        boolean show = false;
        int j = 0;
        for(int i=0;i<temp.length();i++) {
            if(temp.charAt(i)=='.') {
                show=true;
            }
            if(show) {
                if(j<k) {
                    System.out.println(temp.charAt(i));
                }
                j++;
            }
        }
    }

    private static void solve2(int num,int k) {
        int temp = 1;
        while(k-->0) {
            int digit = temp*10/num;
            System.out.println(digit);
            temp = temp*10%num;
        }
    }
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println("Hello World!");
        //solve(3, 4);
        solve2(300, 4);
    }
}
