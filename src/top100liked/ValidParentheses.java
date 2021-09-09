package top100liked;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (stack.empty())
            {
                stack.push(s.charAt(i));
            }
            else
            {
                Character ch1 = stack.peek();
                Character ch2 = s.charAt(i);

                if (ch1.equals('(') && ch2.equals(')') || ch1.equals('{') && ch2.equals('}')
                        || ch1.equals('[') && ch2.equals(']'))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }

        if (stack.empty())
            return true;
        else
            return false;
    }
}
