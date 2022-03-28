package com.tang.leetCodeHot100;

import java.util.HashMap;
import java.util.Map;

public class p3无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int temp = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int j = map.getOrDefault(s.charAt(i), -1);
            if (i - j > temp) temp++;
            else temp=i-j;
            max = Math.max(max, temp);
            map.put(s.charAt(i), i);
        }
        return max;
    }
}
