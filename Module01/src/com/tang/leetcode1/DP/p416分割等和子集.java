package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p416分割等和子集 {
    /*
    给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等
     */
    public boolean canPartition(int[] nums) {
        int n = nums.length, sum = 0, max = 0;
        if (n < 2) return false;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        int target = sum >> 1;
        if (max > target || sum % 2 != 0) return false;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 1; i < n; i++) {
            for (int j = target; j >= nums[i - 1]; j--) {
                dp[j] |= dp[j - nums[i - 1]];
            }
        }
        return dp[target];
    }
}
