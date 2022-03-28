package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 数组中数字出现的次数 {
//    public int[] singleNumbers(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        ArrayList<Integer> res = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1)
//                res.add(entry.getKey());
//        }
//        int[] ans = new int[2];
//        ans[0] = res.get(0);
//        ans[1] = res.get(1);
//        return ans;
//    }
    public static int[] singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int dic = 1;
        while ((dic & ret) == 0) dic <<= 1;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & dic) == 0)
                a ^= num;
            else b ^= num;

        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,1,4,3,6};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
