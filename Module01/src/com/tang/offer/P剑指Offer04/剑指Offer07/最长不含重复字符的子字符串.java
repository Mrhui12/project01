package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.HashMap;
import java.util.Map;

public class 最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {

        int res = 0, temp = 0;
        Map<Character, Integer> map = new HashMap<>();//向上转型
        for (int i = 0; i < s.length(); i++) {
            int j = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            temp = temp < i - j ? temp + 1 : i - j;
            res = Math.max(temp, res);
        }
        return res;
    }
}
/*
动态条件为
1. 没有这个数 默认为-1 temp+=1;
2. 有这个数 但是现在的值已经 temp<i-j; 还是 temp+=1
3.有这个数temp>i-j temp=i-j;
每次返回最大的 res=Math.max(res,temp);
 */