/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 */
public class EditDistance {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.minDistance(word1, word2));
    }

    public int minDistance(String word1, String word2) {
        char str_a[] = word1.toCharArray();
        char str_b[] = word2.toCharArray();
        int m = str_a.length;       // 5
        int n = str_b.length;       // 4
        int[][] dp = new int[m + 1][n + 1]; //dp[5][4]
        int i, j;
        for (j = 0; j <= n; j++) {
            dp[0][j] = j;       // 填充边界
        }

        for (i = 1; i <= m; i++) {
            dp[i][0] = i;       // 填充边界
            for (j = 1; j <= n; j++) {
                if (str_a[i - 1] == str_b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[i-1][j-1];
    }
}
