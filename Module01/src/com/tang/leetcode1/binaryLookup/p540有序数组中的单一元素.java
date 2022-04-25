package com.tang.leetcode1.binaryLookup;

public class p540有序数组中的单一元素 {
    public int singleNonDuplicate(int[] nums){
        int n=0;
        for (int num : nums) {
            n^=num;
        }
        return n;
    }
}
/*
        运动位运算 轻松解决
 */