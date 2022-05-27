package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p287寻找重复数 {
    public int findDuplicate(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (Integer integer : map.keySet()) {
//            if (map.get(integer) >= 2) return integer;
//        }
//        return 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return nums[i];
        }
        return 0;
    }
}
