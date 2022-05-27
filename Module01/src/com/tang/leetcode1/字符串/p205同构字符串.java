package com.tang.leetcode1.字符串;

@SuppressWarnings("all")
public class p205同构字符串 {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(), m = t.length();
        if (n != m) return false;
        int[] snum = new int[26];
        int[] tnum = new int[26];
        for (int i = 0; i < n; i++) {
            int tCnt = t.charAt(i)-'a';
            int sCnt = s.charAt(i)-'a';
            if (snum[sCnt] != tnum[tCnt]) return false;
            snum[sCnt]++;
            tnum[tCnt]++;
        }
        return true;
    }
}
