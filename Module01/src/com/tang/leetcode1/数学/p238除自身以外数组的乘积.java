package com.tang.leetcode1.数学;

import java.util.Arrays;

@SuppressWarnings("all")
public class p238除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int l = 1, r = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= l;
            l *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= r;
            r *= nums[i];
        }
        return ans;
    }
}
/*
   两次遍历
   先从左边往右
    结果等于l
    l*=nums[i];

    然后右往左
    ans[i]*p;
    p*=nums[i]
 */