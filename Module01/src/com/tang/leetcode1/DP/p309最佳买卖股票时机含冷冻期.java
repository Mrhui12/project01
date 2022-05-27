package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p309最佳买卖股票时机含冷冻期 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;
        int[][] dp = new int[n][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);//没有股票 且当天没有买卖
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);//有股票
            dp[i][2] = dp[i - 1][1] + prices[i];//没有股票 当天卖出去的
        }
        return Math.max(dp[n - 1][0], dp[n - 1][2]);//返回没有股票的最大值
    }
}
