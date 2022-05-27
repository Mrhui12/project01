package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p476只出现一次的数字III {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        int index = 0;
        while (true) {
            if ((ans & 1) == 0) {
                index++;
                ans >>= 1;
            } else break;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if (((num >> index) & 1) == 1) a ^= num;
            else b ^= num;
        }
        return new int[]{a, b};
    }
}
/*
    先疑惑所有的元素
    最后会得到两个不一样元素的疑惑
    这个数字&1出现的第一个1就是两个元素不一样的地方
    根据这个一所在的位置分组
     遍历数组  a^num
     b^num
     得到的 a b就是答案
 */