package com.tang.剑指突击;

@SuppressWarnings("All")
public class p3二进制中1的个数 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i]=ans[i>>1]+(i&1);
        }
        return  ans;
    }
}
