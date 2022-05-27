package com.tang.leetcode1.妙用数据结构;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@SuppressWarnings("all")
public class p1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return ans;
    }
}
