package chapter_pre0_recursive_method.exercise;
//细胞分裂： 有一个细胞 每一个小时分裂一次，
// 一次分裂一个子细胞，
// 第三个小时后会死亡。
// 那么n个小时之后有多少细胞？
public class CellProduction {
    public int allCells(int n) {
        if(n==1) {
            return 1;
        }
        //经过第n小时后A状态细胞的数量
        int[] A = new int [n+1]; 
        //经过第n小时后B状态细胞的数量
        int[] B = new int[n+1];
        //经过第n小时后C状态细胞的数量
        int[] C = new int[n+1];
        //initial value
        A[0] = 0;
        B[0] = 0;
        C[0] = 0;
        A[1] = 1;
        B[0] = 0;
        C[0] = 0;
        for(int i=2;i<n+1;i++) {
            A[i] = A[i-1] + B[i-1] + C[i-1];
            B[i] = A[i-1];
            C[i] = B[i-1];
        }
        int res = A[n] + B[n] + C[n];
        return res;
    }
}
