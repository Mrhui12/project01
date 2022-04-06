package com.tang.leetCodeHot100;

public class 爬楼梯 {
    public int climbStairs(int n) {
        if (n<2)return n;
        int[] dps = new int[n + 1];
        dps[1] = 1;
        dps[2] = 2;
        for (int i = 3; i <= n; i++) {
            dps[i] = dps[i - 1] + dps[i - 2];
        }
        return dps[n];
    }
}
/*
动态规整
注意边界条件
 */