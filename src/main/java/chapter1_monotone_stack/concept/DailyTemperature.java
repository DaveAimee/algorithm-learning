package chapter1_monotone_stack.concept;

import java.util.Arrays;
import java.util.LinkedList;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i=0;i<temperatures.length;i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.poll();
                result[index]=i-index;
            }
            stack.push(i);
        }
        return result;
    }
}