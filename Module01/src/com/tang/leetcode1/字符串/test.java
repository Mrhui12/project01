package com.tang.leetcode1.字符串;

import org.junit.Test;

public class test {
    @Test
    public void test1() {
        String a = "bbbaaaba";
        String b = "aaabbbba";
        p205同构字符串 p205 = new p205同构字符串();
        System.out.println(p205.isIsomorphic(a,b));
    }
    @Test
    public void  test2(){
        p227基本计算器II p227 = new p227基本计算器II();
        System.out.println(p227.calculate("42"));
    }
}
