package com.tang.leetcode1.binaryLookup;

public class p154寻找旋转排序数组中的最小值II {
    public int findMix(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r + l) >> 1;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else r--;
        }
        return nums[l];
    }
}
/*
        思路二分查找
        找最小的数
        先判断中点是不是比最大值大
        是的话 就在后半段找
        如果不是比他小的话就在
        [l，mid]
        如果相等 就r--;
最后返回nums[l]

 */