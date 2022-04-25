package com.tang.leetcode1.binaryLookup;

public class P81搜索旋转排序数组 {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return false;
        int r = nums.length - 1, l = 0;
        while (l < r) {
            int mid = (r + l) >> 1;
            if (nums[mid] == target) return true;
            if (nums[l] == nums[mid]) {
                l++;
                continue;
            } else if (nums[l] < nums[mid]) {
                if (target < nums[mid] && target >= nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}
/*
            思路 二分查找
            1.先判断数组数组是否为空
            2.取区间mid 判断mid==target?
            之后判断那边 有序
            用第一个元素判断
            如果第一个元素等于mid
            l++ continue
            如果第一个元素大于 中间  后半部分有序 在后半部分二分查找
            如果第一个元素小于 前半部分有序


 */