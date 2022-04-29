package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p221最大正方形 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, max = 0;
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    }
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max * max;
    }
/*
        动态调整
        当为空 返回0
        最大值为0
        建一个二维动态shuz
        遍历字符串数组
        当它为‘1’的时候
        判断此时的下标
        如果i==0||j==0 dp[i][j]==0;
        反之 dp[i][j]=最小的加1；
        更新max
        返回max*max；
 */
}
