package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;

@SuppressWarnings("all")
public class p128最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        int ans = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            else if (nums[i] == nums[i - 1] + 1) {
                max += 1;
            } else max = 1;
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
