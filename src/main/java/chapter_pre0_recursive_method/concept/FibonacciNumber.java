package chapter_pre0_recursive_method.concept;
//leetcode509:https://leetcode-cn.com/problems/fibonacci-number/submissions/
public class FibonacciNumber {
    public int fib(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }   
}
