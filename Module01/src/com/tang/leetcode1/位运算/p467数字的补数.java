package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p467数字的补数 {
    public int findComplement(int num) {
        int ans = 0, index = 0;
        while (num > 0) {
            int n = num % 2;
            n ^= 1;
            ans += n << index++;
            num >>= 1;

        }
        return ans;
    }
}
