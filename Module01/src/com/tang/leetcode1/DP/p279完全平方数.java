package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p279完全平方数 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
            for (int j = 1; j * j <= i; j++) {

                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }

        }
        return dp[n];

    }
}
/*
        给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
        对于分割类型题，动态规划的状态转移方程通常并不依赖相邻的位置，而是依赖于满足分割
        条件的位置。
        因此 dp[i] 可以取的最小值即为 1 + min(dp[i-1], dp[i-4], dp[i-9]);
 */