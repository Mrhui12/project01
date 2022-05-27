package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class p326幂 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;

        while (n > 1) {
            if (n % 3 != 0) return false;
            n = n / 3;
        }
        return true;
    }
}
/*
    判断当N《1 return false;
    当n >1
    判断n%3！=0
    n/=3;
 */