package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;

@SuppressWarnings("all")
public class p217存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}
