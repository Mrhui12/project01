package com.tang.leetCodeHot100;

public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int per = 0;
        for (int num : nums) {
            per = Math.max(per + num, num);
            max = Math.max(per, max);
        }
        return max;
    }
}
