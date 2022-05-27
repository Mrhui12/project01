package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p693交替位二进制数 {
    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int pre = n & 1;
            int cur = (n >>= 1) & 1;
            if ((pre ^ cur) == 1) continue;
            else return false;
        }
        return true;
    }
}
/*
            因为相临的数不同
            所以用一一个数表示 前面的 一个数表示下一个
            如果他们疑惑不等于1 直接返回false
            退出循环后返回true;
 */