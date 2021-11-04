package interviewQ;

import java.util.Stack;

public class VP20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n == 1)
            return false;
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < n; i++) {
            if (stack.empty())
                stack.push(s.charAt(i));
            else {
                if ((char) stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if ((char) stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else if ((char) stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else stack.push(s.charAt(i));
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        VP20 vp20 = new VP20();
        System.out.println(vp20.isValid(s));
    }
}
