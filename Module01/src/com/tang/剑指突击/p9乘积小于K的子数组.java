package com.tang.剑指突击;

@SuppressWarnings("ALL")
public class p9乘积小于K的子数组 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int right = 0, left = 0;
        int total = 1, ans = 0;
        while (right < nums.length) {
            total *= nums[right++];
            while (left < right && total >= k) {
                total /= nums[left++];
            }
            ans += right - left;
        }
        return ans;
    }
}
/*
    滑动窗口
    当r<n  且累计 下雨k  ans+=r-l
    反之 t/num[l++]
    ans+=r-l;
 */