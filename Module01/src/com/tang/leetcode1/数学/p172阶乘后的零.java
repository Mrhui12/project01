package com.tang.leetcode1.数学;
@SuppressWarnings("all")
public class p172阶乘后的零 {
    public int trailingZeroes(int n) {
       return n==0?0:n/5+trailingZeroes(n/5);
    }
}
/*
  主要看5
  当0不为0的时候
  返回结果为n/5 + f(n/5)
 */