package interviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public int maxProfitWithKTransactions(int[] prices, int k) {
        // Write your code here.
        int[][] profti = new int[k + 1][prices.length];
        for (int i = 1; i < k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < prices.length; j++) {
                max = Math.max(max, - prices[j - 1] + profti[i - 1][j - 1]);
                profti[i][j] = Math.max(profti[i][j - 1], prices[j] + max);
            }
        }
        return profti[k][prices.length - 1];
    }

    public static void main(String[] args) {
        int[] prices = {1, 25, 24, 23, 12, 36, 14, 40, 31, 41, 5};
        int k = 2;
        demo d = new demo();
        System.out.println(d.maxProfitWithKTransactions(prices, k));
    }
}
