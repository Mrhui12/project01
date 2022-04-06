package com.tang.leetCodeHot100;

public class p33搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int temp = nums.length-1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                temp = i;
        }
        if (target > nums[0]) {
            int l = 0, r = temp;
//            int mid=(l+r)>>1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target)
                    r = mid - 1;
                else l = mid + 1;
            }
            return -1;
        } else if (target == nums[0]) return 0;
        else {
            int l = temp + 1, r = nums.length - 1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target)
                    r = mid - 1;
                else l = mid + 1;
            }
            return -1;

        }
    }
}
