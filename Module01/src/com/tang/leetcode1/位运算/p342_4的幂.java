package com.tang.leetcode1.位运算;

@SuppressWarnings("all")
public class p342_4的幂 {
    public boolean isPowerOfFour(int n) {
        if (n < 1) return false;
      while (n%4==0)
          n/=4;
      return n==1;
    }
}
/*
       当这个数字小于1的时候 直接返回 fasle;
       当这个数字对4取余等于0
       就让他循环的n/=4
       直到不为0
       判断它是不是等于1

 */