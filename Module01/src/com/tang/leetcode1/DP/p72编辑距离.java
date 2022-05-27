package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p72编辑距离 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0 || n == 0) return m == 0 ? n : m;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0]=i;
        }
        for (int i = 1; i <= n; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
            }
        }
        return dp[m][n];
    }
}
/*
            动态规整 最好画图
            当有0长度的字符串的时候
            直接返回另一个的长
            创建 一个动态数组 dp[m+1][n+1] dp[i][j]代表 要修改的最小次数
           让1 第一行 第一列 等于 对应的i  因为第一行代表一个数组没有 要变成另一个
            遍历
            当对应字符串相等时候
            dp i j =dp i-1 j-1
            反之等于 i-1 j-1 、i-1 j |i j-1 里面最小的一个 +1
            最后返回 dp[m][n];

 */