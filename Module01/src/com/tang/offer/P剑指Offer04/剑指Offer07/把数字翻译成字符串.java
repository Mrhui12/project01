package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 把数字翻译成字符串 {
    public int translateNum(int num) {
        String strs = String.valueOf(num);
        int a = 1, b = 1;
        for (int i = 1; i < strs.length(); i++) {
            String temp = strs.substring(i - 1, i + 1);
            int c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b : a;//DP条件
            b = a;
            a = c;
        }
        return a;
    }
}
