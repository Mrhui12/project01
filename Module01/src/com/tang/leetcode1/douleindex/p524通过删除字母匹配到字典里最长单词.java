package com.tang.leetcode1.douleindex;

import java.util.List;

public class p524通过删除字母匹配到字典里最长单词 {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) i++;
                j++;
            }
            if (i == t.length()) {
                if (t.length() > res.length() || t.length() == res.length() && t.compareTo(res) < 0) res = t;
            }
        }
        return res;
    }
}
/*
        思路 双指针
        先遍历字典
        两个指针 一个指向S开头 一个指向T开头
        再滑动遍历
        当S==T i++
        j++;
        之后判断 i==t.length()?
        在判断和结果res的长度  以及字典排序
 */