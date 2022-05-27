package com.tang.leetcode1.字符串;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p409最长回文串 {
    public int longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return n;
        Map<Character, Integer> map = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0, max = 0;
        for (Character character : map.keySet()) {
            int num = map.get(character);
            ans += num / 2 * 2;
            if (ans % 2 == 0 && num % 2 != 0)
                ans++;
        }

        return ans;
    }
}
