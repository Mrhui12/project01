package com.tang.leetcode1.贪心;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class p763划分字母区间 {
    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
        for (Integer partitionLavle : partitionLavles(s)) {
            System.out.println(partitionLavle);
        }

    }
    public static List<Integer> partitionLavles(String s) {
        int n = s.length();
        int[] last = new int[26];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(last[s.charAt(i) - 'a'], end);
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }
}
/*
        划分字母区间
        先遍历一遍所有字符串
        得到每个字符串对应的最大地址
        然后 从遍历
        动态调整end 当i==end 加入答案 end-start+1 ;同时调整start的值

 */