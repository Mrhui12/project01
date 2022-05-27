package com.tang.剑指突击;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p5单词长度的最大乘积 {
    public int maxProduct(String[] words) {
        int n = words.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int bit = 0;
            for (char c : words[i].toCharArray()) {
                bit |= (1 << (c - 'a'));
            }
            map.put(bit, Math.max(map.getOrDefault(bit, 0), words[i].length()));
        }
        int ans = 0;
        for (Integer num : map.keySet()) {
            for (Integer integer : map.keySet()) {
                if ((num & integer) == 0) ans = Math.max(ans, map.get(num) * map.get(integer));
            }
        }
        return ans;
    }
}
