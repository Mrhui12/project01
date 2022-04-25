package com.tang.leetcode1.douleindex;

public class p680验证回文字符串Ⅱ {
    public boolean validPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0, count = 1;
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);

        }
        return true;
    }

    private boolean validPalindrome(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else return false;
        }
        return true;
    }
}
/*
        思路没有错
        那个地方细节错了
        还是不知道哪里错了 还是用方法从摘的方法吧

 */