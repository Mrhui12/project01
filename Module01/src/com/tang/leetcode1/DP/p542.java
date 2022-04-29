package com.tang.leetcode1.DP;

public class p542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        if (m == 0) return null;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) dp[i][j] = 10000;
            }
        }
//        左上出发
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0)
                    dp[i][j] = Math.min((dp[i][j]), dp[i - 1][j] + 1);
                if (j - 1 >= 0)
                    dp[i][j] = Math.min((dp[i][j]), dp[i][j - 1] + 1);
            }
        }
//        右下出发
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i + 1 <= m - 1)
                    dp[i][j] = Math.min((dp[i][j]), dp[i + 1][j] + 1);
                if (j + 1 <= n - 1)
                    dp[i][j] = Math.min((dp[i][j]), dp[i][j + 1] + 1);
            }
        }
        return dp;
    }
}
/*
            边界条件怎么处理？
            右上 左下
            两次遍历

 */