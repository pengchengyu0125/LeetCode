package interviewQ;

public class WM44 {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            dp[i + 1][0] = false;
        }
        for (int i = 0; i < m; i++) {
            if (p.charAt(i) == '*' && dp[0][i])
                dp[0][i + 1] = true;
            else dp[0][i + 1] = false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')
                    dp[i + 1][j + 1] = dp[i][j];
                else if (p.charAt(j) == '*') {
                    if (dp[i + 1][j] == true || dp[i][j + 1])
                        dp[i + 1][j + 1] = true;
                    else dp[i + 1][j + 1] = false;
                }
                else dp[i + 1][j + 1] = false;
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        WM44 wm44 = new WM44();
        System.out.println(wm44.isMatch(s, p));
    }
}
