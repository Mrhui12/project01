package com.tang.leetcode1.妙用数据结构;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p697数组的度 {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length, max = 0, minwindow = 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] pair = map.get(nums[i]);
            if (pair == null) {
                pair = new int[]{i, 1};
                map.put(nums[i], pair);
            } else {
                pair[1]++;
            }
            if (pair[1] > max) {
                max = pair[1];
                minwindow = i - pair[0] + 1;
            } else if (pair[1] == max)
                minwindow = Math.min(minwindow, i - pair[0] + 1);
        }
        return minwindow;
    }
}
