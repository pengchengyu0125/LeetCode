package top100liked;

import java.util.Stack;

/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 */
public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        LargestRectangleinHistogram large = new LargestRectangleinHistogram();
        System.out.println(large.largestRectangleArea(heights));

    }
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length < 1)
            return 0;

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            // 把堆栈中比heights[i]大的元素都pop出，并计算面积
            while (stack.peek() != -1 && heights[i] < heights[stack.peek()]) {
                int top = stack.pop();
                // 面积计算公式：(i - 1-stack.peek() ) * heights[top])
                max = Math.max(max, (i - 1 - stack.peek()) * heights[top]);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int top = stack.pop();
            max = Math.max(max, (heights.length - 1 - stack.peek()) * heights[top]);
        }
        return max;
    }
}
