package com.tang.leetcode1.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p451根据字符出现频率排序 {
    public String frequencySort(String s) {
        if (s.length() < 3) return s;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] list = new List[s.length() + 1];
        for (Character character : map.keySet()) {
            int i = map.get(character);
            if (list[i] == null) list[i] = new ArrayList();
            for (int i1 = 0; i1 < i; i1++) {
                list[i].add(character);
            }
        }
        List<Character> res = new ArrayList<>();
        for (int j = s.length() - 1; j >= 0; j--) {
            if (list[j] == null) continue;
            res.addAll(list[j]);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ans.append(res.get(i));
        }
        return ans.toString();

    }
}
