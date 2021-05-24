/*
Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s = "mississippi", p = "mis*is*p*.";
        RegularExpressionMatching expressionMatching = new RegularExpressionMatching();
        System.out.println(expressionMatching.isMatch(s, p));
    }

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];  //java中初始化默认为false
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {   /*为了消除a*这种与空串的匹配，比如s是空，a*或者a*b*都是满足条件的，执行这个循环就可以得到满足条件的情况，并设为true*/
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) == s.charAt(i) | p.charAt(j-1) == '.') {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    } else {
                        dp[i+1][j+1] =  dp[i+1][j-1];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
