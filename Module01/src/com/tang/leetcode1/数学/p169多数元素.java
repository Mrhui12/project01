package com.tang.leetcode1.数学;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p169多数元素 {
    public int majorityElement(int[] nums) {
//        int n = nums.length;
//        int ans = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> mapfor : map.entrySet()) {
//            Integer key = mapfor.getKey();
//            Integer value = mapfor.getValue();
//            if (value > n / 2) ans = key;
//        }
//        return ans;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
