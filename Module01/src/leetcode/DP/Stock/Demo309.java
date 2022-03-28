package leetcode.DP.Stock;

public class Demo309 {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int[][] dps = new int[n][3];
        dps[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            dps[i][0] = Math.max(dps[i - 1][0], dps[i - 1][2] - prices[i]);
            dps[i][1] = dps[i - 1][0] + prices[i];
            dps[i][2] = Math.max(dps[i - 1][1], dps[i - 1][2]);
        }
        return Math.max(dps[n - 1][2], dps[n - 1][1]);
    }
}
