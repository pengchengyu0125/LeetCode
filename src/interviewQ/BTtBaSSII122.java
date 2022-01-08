package interviewQ;

public class BTtBaSSII122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int n = prices.length;
        if (n == 1)
            return sum;
        int left = 0;
        int right = 1;
        while (right < n) {
            if (prices[left] > prices[right]) {
                ++left;
                ++right;
                continue;
            }
            if (right == n - 1 || prices[right] > prices[right + 1]) {
                sum += prices[right] - prices[left];
                left = right + 1;
                right = left + 1;
                continue;
            }
            ++right;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        BTtBaSSII122 bTtBaSSII122 = new BTtBaSSII122();
        System.out.println(bTtBaSSII122.maxProfit(prices));
    }
}
