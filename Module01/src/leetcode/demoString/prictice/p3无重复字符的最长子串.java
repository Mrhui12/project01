package leetcode.demoString.prictice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class p3无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n < 2) return n;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i)))
                left = map.get(s.charAt(i)) + 1;
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
return  max;

    }

    public static void main(String[] args) {
        String s = "asdavbasdas";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
