package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p338比特位计数 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                ans[i] += temp & 1;
                temp >>= 1;
            }
        }
        return ans;
    }
}
