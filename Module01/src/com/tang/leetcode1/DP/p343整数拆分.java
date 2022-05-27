package com.tang.leetcode1.DP;

@SuppressWarnings("all")

public class p343整数拆分 {
    public int integerBreak(int n) {
        if (n < 4) return n - 1;
        int ans = 1;
        while (n > 4) {
            n -= 3;
            ans *= 3;
        }
        ans *= n;
        return ans;
    }
}
/*
        换成 3 或者2最厉害
        当小于4的时候
        直接返回n-1
        当大于4 n-=3
        ans*=3;
        之后再乘以n
 */