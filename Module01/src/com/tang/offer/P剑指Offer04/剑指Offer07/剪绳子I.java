package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 剪绳子I {
    public static int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        long res = 1;
        while (n > 4) {
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int) (res * n) % 1000000007;
    }


}
