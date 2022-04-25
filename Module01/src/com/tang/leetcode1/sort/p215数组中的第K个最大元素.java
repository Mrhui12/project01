package com.tang.leetcode1.sort;

import java.util.Arrays;

public class p215数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        quciksort(nums, 0, nums.length);
        return nums[nums.length - k];
    }

    private static void quciksort(int[] nums, int l, int r) {
        if (l + 1 >= r) return;
        int first = l, last = r - 1, key = nums[first];
        while (first < last) {
            while (first < last && nums[last] >= key) last--;
            nums[first] = nums[last];
            while (first < last && nums[first] < key)
                first++;
            nums[last] = nums[first];
        }
        nums[first]=key;
        quciksort(nums,l,first);
        quciksort(nums,first+1,r);
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        quciksort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
/*
    基于快速排序的快速选择
    需要打乱顺序 避免 最差的时间复杂度
 */