package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 丑数 {
    public int nthUglyNumber(int n) {

        int[] dps = new int[n];
        dps[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dps[a] * 2;
            int n3= dps[b] * 3;
            int n5 = dps[c] * 5;
            dps[i] = Math.min(n2, Math.min(n3, n5));
            if (dps[i]==n2)a++;
            if (dps[i]==n3)b++;
            if (dps[i]==n5)c++;
        }
        return dps[n - 1];
    }

}
/*
动态条件
dp[n+1]=最小的dp[a] dp[b] dp[c]
dp[a] *2>dp[n] dp[b] *3>dp[b] dp[c] *5>dp[c]
 */