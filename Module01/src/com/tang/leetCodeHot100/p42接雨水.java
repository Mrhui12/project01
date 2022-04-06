package com.tang.leetCodeHot100;

public class p42接雨水 {
    public int trap(int[] height) {
        int sum = 0;
        int[] max_left = new int[height.length];
        int[] max_right = new int[height.length];
        for (int i = 1; i < height.length - 1; i++) {
            max_left[i] = Math.max(height[i - 1], max_left[i - 1]);
        }
        for (int i = height.length - 2; i >= 1; i--) {
            max_right[i] = Math.max(height[i + 1], max_right[i + 1]);

        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {//比较两边的最大值的小的那个和当前的值大小
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }
}
