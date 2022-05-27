package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p300最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        int max = 1;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
/*
    DP
     让所有的dp==1
     i遍历 i=1:n-1
     j 遍历 j=0:i-1;
     更新DPi  当 nums[i]>nums[j]的时候

 */