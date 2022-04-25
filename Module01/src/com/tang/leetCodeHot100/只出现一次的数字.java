package com.tang.leetCodeHot100;

import java.util.Arrays;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans^=num;
        }
        return ans;
    }
}
/*
位运算
异或运算；
 */