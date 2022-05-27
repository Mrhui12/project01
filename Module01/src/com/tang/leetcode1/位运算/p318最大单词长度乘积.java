package com.tang.leetcode1.位运算;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p318最大单词长度乘积 {
    public int maxProduct(String[] words) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int t = 0, m = word.length();
            for (int i = 0; i < m; i++) {
                int u = word.charAt(i) - 'a';
                t |= (1 <<u);//1左移动u位
            }
            if (!map.containsKey(t) || map.get(t) < m) map.put(t, m);
        }
        int ans = 0;
        for (Integer a : map.keySet()) {
            for (Integer b : map.keySet()) {
                if ((a & b) == 0) ans = Math.max(ans, map.get(a) * map.get(b));
            }
        }
        return ans;
    }
}
/*
 用一个哈希表记录 每个字母的长度
   遍历每个单词
   然后遍历每个单词字符串
   u|=t |= (1 <<u)；
   遍历完 确认改字符串 有没有被记录过 如果有比较记录的他和当前的长度
    加入 新的
    之后遍历 Keyset
       再遍历 Keyset
       如果 map.get(i)&map.get(j)==0 ans =max.(ans,ma
 */