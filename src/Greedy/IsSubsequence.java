/*
Given a string s and a string t, check if s is subsequence of t.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?

Credits:
Special thanks to @pbrother for adding this problem and creating all test cases.



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 10^4
Both strings consists only of lowercase characters.
 */
package Greedy;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence(s, t));
    }

    Boolean isSubsequence(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int l = b.length;
        int num = a.length;
        int j = 0;
        for (int i = 0; i < l; ++i) {
            if (num < 1)
                break;
            if (a[j] == b[i]) {
                ++j;
                --num;
            }
        }
        if (num > 0)
            return false;
        return true;
    }
}
