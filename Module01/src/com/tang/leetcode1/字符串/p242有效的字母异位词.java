package com.tang.leetcode1.字符串;

@SuppressWarnings("all")
public class p242有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) return false;
        int[] dp = new int[26];
        for (int i = 0; i < n; i++) {
            dp[s.charAt(i) - 'a']++;
            dp[t.charAt(i) - 'a']--;
        }
        for (int i : dp) {
            if (i != 0) return false;
        }
        return true;

    }
}
