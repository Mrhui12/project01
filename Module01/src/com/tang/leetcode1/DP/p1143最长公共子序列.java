package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p1143最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
/*
       字符串匹配  用图解法 和就该变成一样的特别像
       设定一个二维动态数组 m+1 n+1
       遍历
       当 i-1 =j-1
       dp[i][j]=dp[i-1][j-1]+1
       反之等于 dp[i-1][j] 和dp[i][j-1]的最大值

       最后返回dp[m][n]

 */