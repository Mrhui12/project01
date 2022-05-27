package com.tang.leetcode1.DP;

import java.util.Enumeration;

public class p714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n <= 1) return 0;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
/*
    思路 用两种状态来记录 当前的最大收益 一种是 有股票 一种是没有股票
    初试话 dp[0][0]=0 dp[0][1]=-prices[0]
    第一种没有有股票  dp[i][0]没有股票 Math.max(dp[i-1][[0],dp[i-1][1]+price[i]-fee]
    第二种有股票  dp[i][1]=Math.max(dp[i-1][0]-price[i],dp[i-1][1])
 */