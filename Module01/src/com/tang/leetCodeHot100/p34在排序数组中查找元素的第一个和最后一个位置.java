package com.tang.leetCodeHot100;

public class p34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = new int[]{-1, -1};
        while (l <= r) {
            int mid = (r + l) >> 1;
            if (nums[mid] == target) {
                int right = mid, left = mid;
                while (right < nums.length && nums[right] == target) right++;
                while (left >= 0 && nums[left] == target) left--;
                res[0] = left+1;//因为下个不是 所以需要-1 加一
                res[1] = right-1;
                return  res;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else r = mid - 1;
        }
        return  res;
    }
}
/*
注意边界问题的处理
总体思路 用二分查找找出 一个target的位置
然后再往左移或者往右移动
 */