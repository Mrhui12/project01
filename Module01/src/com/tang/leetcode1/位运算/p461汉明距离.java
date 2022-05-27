package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p461汉明距离 {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y, ans = 0;
        while (diff > 0) {
            ans += diff & 1;
            diff >>= 1;
        }
        return ans;
    }
}
/*
        第一先 求 x^y
        然后判断其中1的个数；
 */