package chapter1_monotone_stack.excersice;

import java.util.Stack;

public class StockSpanner {
    Stack<Integer> prices, weights;

    public StockSpanner() {
        prices = new Stack<>();
        weights = new Stack<>();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += weights.pop();
        }
        prices.push(price);
        weights.push(w);
        return w;
    }
    public static void main(String[] args) {
        StockSpanner sol = new StockSpanner();
        sol.next(100); 
        sol.next(80);
        sol.next(60);
        sol.next(70);  
        sol.next(60);  
        sol.next(75);  
        sol.next(85);  
    }
}
