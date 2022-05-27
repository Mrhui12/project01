package com.tang.leetcode1.数学;

import java.util.Arrays;

@SuppressWarnings("all")
public class p462最少移动次数使数组元素相等II {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += Math.abs(num - nums[n / 2]);
        }
        return sum;
    }
}
