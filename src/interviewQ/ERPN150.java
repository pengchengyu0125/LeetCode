package interviewQ;

import java.util.Stack;

public class ERPN150 {
    public int evalRPN(String[] tokens) {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                String num1 = strings.pop();
                String num2 = strings.pop();
                int sum = Integer.valueOf(num2) + Integer.valueOf(num1);
                strings.push(String.valueOf(sum));
            } else if (tokens[i].equals("-")) {
                String num1 = strings.pop();
                String num2 = strings.pop();
                int sum = Integer.valueOf(num2) - Integer.valueOf(num1);
                strings.push(String.valueOf(sum));
            } else if (tokens[i].equals("*")) {
                String num1 = strings.pop();
                String num2 = strings.pop();
                int sum = Integer.valueOf(num2) * Integer.valueOf(num1);
                strings.push(String.valueOf(sum));
            } else if (tokens[i].equals("/")) {
                String num1 = strings.pop();
                String num2 = strings.pop();
                int sum = Integer.valueOf(num2) / Integer.valueOf(num1);
                strings.push(String.valueOf(sum));
            } else {
                strings.push(tokens[i]);
            }
        }
        return Integer.valueOf(strings.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        ERPN150 erpn150 = new ERPN150();
        System.out.println(erpn150.evalRPN(tokens));
    }
}
