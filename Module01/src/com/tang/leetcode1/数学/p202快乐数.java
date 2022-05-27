package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class p202快乐数 {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = bitSqeareSum(slow);
            fast = bitSqeareSum(fast);
            fast = bitSqeareSum(fast);

        } while (fast != slow);
        return fast == 1;
    }

    private int bitSqeareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
/*
        利用快慢指针 判断循环
        用 “快慢指针” 思想，找出循环：“快指针” 每次走两步，“慢指针” 每次走一步，当二者相等时，即为一个循环周期。此时，判断是不是因为 1 引起的循环，是的话就是快乐数，否则不是快乐数。


 */