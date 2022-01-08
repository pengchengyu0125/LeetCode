package interviewQ;

import java.util.Arrays;
import java.util.Comparator;

public class BTtBaSS121 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        BTtBaSS121 bTtBaSS121 = new BTtBaSS121();
        System.out.println(bTtBaSS121.maxProfit(prices));
    }
}
