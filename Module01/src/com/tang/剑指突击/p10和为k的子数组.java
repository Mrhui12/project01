package com.tang.剑指突击;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p10和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
