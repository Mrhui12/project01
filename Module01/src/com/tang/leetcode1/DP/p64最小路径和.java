package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p64最小路径和 {
    public int minPathSum(int[][] grid
    ) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int k = 1; k < n; k++) {
                dp[i][k] = Math.min(dp[i - 1][k], dp[i][k - 1]) + grid[i][k];
            }
        }
        return dp[m-1][n-1];
    }
}
/*
    注意处理好边界条件

 */