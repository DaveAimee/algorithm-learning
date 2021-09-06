package chapter1_monotone_stack.excersice;

import java.util.LinkedList;

//leetcode84: https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int maxArea = 0;
        for(int i=0;i<heights.length;i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.peek()];
                stack.pop();
                int width = i-stack.peek()-1;
                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        while(stack.peek() != -1) {
            int top = heights[stack.peek()];
            stack.pop();
            int area = top * (stack.size() - stack.peek() -1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
