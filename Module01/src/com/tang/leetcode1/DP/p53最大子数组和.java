package com.tang.leetcode1.DP;
@SuppressWarnings("all")
public class p53最大子数组和 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int pre=0;
        for (int num : nums) {
            pre=Math.max(pre+num,num);
            max=Math.max(pre,max);
        }
        return max;
    }
}
