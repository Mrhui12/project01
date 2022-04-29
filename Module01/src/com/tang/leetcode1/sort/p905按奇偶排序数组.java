package com.tang.leetcode1.sort;

@SuppressWarnings("all")
public class p905按奇偶排序数组 {
    public int[] sortArrayByParity(int[] nums) {
        int r = nums.length;
        int l = 0;
        if (r < 2) return nums;
        int first = l, last = r - 1, key = nums[first];
        while (first < last) {
            while (first < last && nums[last] % 2 == 1) last--;
            nums[first] = nums[last];
            while (first < last && nums[first] % 2 == 0) first++;
            nums[last] = nums[first];
        }
        nums[first] = key;
        return nums;
    }
}
/*
        给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
        快速排序简单版本
 */