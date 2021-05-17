/*
Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:

Input: 5
Output: True
Explanation: 1 * 1 + 2 * 2 = 5


Example 2:

Input: 3
Output: False
 */
package TwoPointers;

public class SumofSquareNumbers {
    public static void main(String[] args) {
        int c = 100000;
        SumofSquareNumbers s = new SumofSquareNumbers();
        System.out.println(s.judgeSquareSum(c));
    }

    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        if (c == 0 || c == 1)
            return true;
        else
            while (i <= j) {
                int a = i * i, b = j * j;
                if (a + b == c)
                    return true;
                else if (a + b > c)
                    --j;
                else ++i;
            }
        return false;
    }
}
