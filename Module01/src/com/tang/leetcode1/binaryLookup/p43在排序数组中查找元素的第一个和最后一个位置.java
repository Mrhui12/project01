package com.tang.leetcode1.binaryLookup;

public class p43在排序数组中查找元素的第一个和最后一个位置 {
    public int[] seachRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] == target) {
                int leftindex = mid, rightindex = mid;
                while (leftindex>=0&&nums[leftindex] == target) leftindex--;
                while (nums[rightindex] == target&&rightindex<nums.length) rightindex++;
                return new int[]{leftindex + 1, rightindex - 1};
            } else if (nums[mid] > target) r--;
            else l++;
        }
        return new int[]{-1, -1};
    }
}
/*
        二分查找，利用二分查找先找出target
        然后让它的坐标满足边界条件下 -- ++ 超出不得不等于target 的范围
        之后返回结果 l+1 r-1
        如果找不到直接返回-1 -1
 */