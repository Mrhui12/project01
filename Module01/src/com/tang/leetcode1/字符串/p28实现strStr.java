package com.tang.leetcode1.字符串;

@SuppressWarnings("all")
public class p28实现strStr {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        if (needle.length() == 0) return 0;
        while (i < haystack.length() && j < needle.length()) {
            char s = haystack.charAt(i);
            char n = needle.charAt(j);
            if (s == n) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == needle.length()) return i - j;
        }
        return -1;
    }
}
/*
   双指针思路  用两个双指针 指向 两个字符串的起始位置
   当 子串为空 返回 0
   当 两个指针不越界
   去除指针对应的字符
   当两个相等的时候
   直接 都加加
   不等 就 i=i-j+1
   j=0;
   如果子串达到长度
   染回 i-j
   遍历完 返回 -1；
 */