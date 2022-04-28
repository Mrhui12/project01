package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p413等差数列划分 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length<3)return 0;
        int n=nums.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (nums[i-1]*2==nums[i]+nums[i-2])
                dp[i]=dp[i-1]+1;
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            count+=dp[i];
        }
        return count;
    }
}
/*
   dp i是针对每一个结尾的
   要算总的还得把所有的DP求和
 */