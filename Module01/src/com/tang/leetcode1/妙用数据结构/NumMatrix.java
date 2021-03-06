package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("all")
public class NumMatrix {

    private int[][] dp;

    public NumMatrix(int[][] matrix1) {
        int n = matrix1.length;
        int m = matrix1[0].length;
        dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = matrix1[i - 1][j - 1] + dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1];

            }
        }
    }


    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row2+1][col1] - dp[row1][col2 + 1] + dp[row1][col1];

    }
}
