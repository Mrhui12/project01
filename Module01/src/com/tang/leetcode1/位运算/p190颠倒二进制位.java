package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p190颠倒二进制位 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans<<=1;
            ans+=n&1;
            n>>=1;
        }
     return  ans;
    }
}
/*
   利用左移 右移

 */