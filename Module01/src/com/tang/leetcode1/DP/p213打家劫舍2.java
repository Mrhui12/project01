package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p213打家劫舍2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n + 1];
        dp[1] = nums[0];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        int[] dp2 = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i - 1]);
        }
        return Math.max(dp2[n], dp[n - 1]);
    }
}
/*
        很简单分成 1~n-1  2~n就可以了
        再让他们的最大值 比较
 */