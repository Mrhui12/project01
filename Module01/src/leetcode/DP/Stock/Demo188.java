package leetcode.DP.Stock;

public class Demo188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        if (k >= n) {
            return maxProfitUnlimited(prices);
        }
        int[] buy = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            buy[i] = Integer.MIN_VALUE;
        }
        int[] sell = new int[k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }

        }
        return sell[k];
    }

    private int maxProfitUnlimited(int[] prices) {
        int max = 0;
        for (int i = 1; i <= prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
