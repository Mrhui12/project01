package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p10正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
                    }
                }
            }

        }
        return dp[m][n];
    }
}
/*
            根据条件来判断
            首先确定边界条件
            dp[0][0]=true;
            第0行条件  p.charAt(i-1)=='*' dp[0][i]=dp[0][i-2];
            之后遍历判断
            当当前在字符串相等 或者为.的时候 dp[i][j]=dp[i-1][j-1]
            当为 *  但是前一个不等于现在的 而且 上一个不为.的时候
            dp[i][j]=dp[i][j-2];
            反正
            的dp[i][j]=dp[i-1][j] 判断不要最后的能不能相等||dp[i][j-1] 不要最后的* 能不能相等||dp[i][j-2] 不要.*等不能相等
            最后返回
            dp[m][n];

 */