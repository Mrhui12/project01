package com.tang.leetcode1.douleindex;

public class p633平方数之和 {
    public boolean judgeSqareSum(int c) {
        long l = 0, r = (long) Math.sqrt(c);

        while (l <= r) {
            long b = r * r + l * l;
            if (b == c) return true;
            else if (b < c) l++;
            else r--;
        }
        return false;
    }
}
/*
        双指针但是要注意类型
        注意内型转换
        将所有的int转成 long
        再做后续计算
 */