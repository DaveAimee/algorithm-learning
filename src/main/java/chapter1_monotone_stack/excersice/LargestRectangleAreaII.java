package chapter1_monotone_stack.excersice;

import java.util.LinkedList;

public class LargestRectangleAreaII {
    public int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int maxArea = 0;
        for(int i=0;i<heights.length;i++) {
            while(stack.peek()!=-1 && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.peek()];
                stack.pop();
                int width = i - stack.peek() -1;
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        while(stack.peek()!=-1) {
            int height = heights[stack.peek()];
            stack.pop();
            int width = heights.length - stack.peek() -1;
            maxArea=Math.max(maxArea,height*width);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
        {
            return 0;
        }
        int num_of_rows = matrix.length;
        int num_of_cols = matrix[0].length;
        int [] heights = new int[num_of_cols];
        int maxRec = -1;
        for (int i = 0; i < num_of_rows; i++)
        {
            for (int j = 0; j < num_of_cols; j++)
            {
                if (matrix[i][j] == '1')
                {
                    heights[j]++;
                }
                else
                {
                    heights[j] = 0;
                }
            }
            maxRec = Math.max(maxRec, largestRectangleArea(heights));
        }
        return maxRec;
    }
}
