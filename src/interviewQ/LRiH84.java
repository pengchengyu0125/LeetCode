package interviewQ;

import java.util.Stack;

public class LRiH84 {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        int len = heights.length;
        int[] arr = new int[len + 2];
        for (int i = 0; i < len; i++) {
            arr[i+1] = heights[i];
        }
        Stack<Integer> stack = new Stack<>();
        int index = 1;
        stack.push(0);
        while (index < arr.length) {
            while (index < arr.length && arr[index] >= arr[stack.peek()])
                stack.push(index++);
            while (index < arr.length && arr[index] < arr[stack.peek()]) {
                int curHeight = arr[stack.pop()];
                res = Math.max(res, curHeight * (index - stack.peek() - 1));
            }
            stack.push(index);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        LRiH84 lRiH84 = new LRiH84();
        System.out.println(lRiH84.largestRectangleArea(heights));
    }
}
