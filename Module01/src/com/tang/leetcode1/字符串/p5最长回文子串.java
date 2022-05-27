package com.tang.leetcode1.字符串;

@SuppressWarnings("all")
public class p5最长回文子串 {

    public String longestPalindrome(String s) {
        int max = 0, n = s.length();
        char[] sc = s.toCharArray();
        int[] result = new int[2];
        for (int i = 0; i < 2 * n - 1; i++) {
            int l = i / 2, r = l + i % 2;
            while (l >= 0 && r < n && sc[l] == sc[r]) {
                if (r - l > max) {
                    max = r - l;
                    result[0] = l;
                    result[1] = r;
                }
                l--;
                r++;
            }
        }
        return s.substring(result[0], result[1] + 1);
    }
}
