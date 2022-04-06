package com.tang.leetCodeHot100;

import java.util.Arrays;

public class 排1下一个排列 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 0) return;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, n);//为什么不是N-1 排序
                for (int j = i; j < n; j++) {
                    int temp = nums[j];
                    if (nums[j] > nums[i - 1]) {//交换
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }


        }
        Arrays.sort(nums);
        return;
    }
}
