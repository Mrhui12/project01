package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class P650只有两个键的键盘 {
    public int minSteps(int n) {
        if (n < 2) return 0;
        int[] dp = new int[n + 1];
        int H = (int) Math.sqrt(n);
        for (int i = 2; i < n; i++) {
            dp[i] = i;
            for (int j = 2; j <= H; j++) {
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                }
            }
        }
        return dp[n];
    }
}
/*
            如果一个数可以被整除 等于吧1 变道 i/j
            当然需要1除外 因为1可以被任何数字整除
            dp[i]=i;
            dp[i]=dp[j]+dp[i/j];整除的情况
 */