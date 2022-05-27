package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p136只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
