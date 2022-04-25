package com.tang.leetcode1.贪心;

import java.util.Arrays;

public class p455分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int n = g.length, m = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < n && j < m; i++, j++) {
            if (g[i] <= s[j]) count++;
            while (j < m && g[i] > s[j]) j++;//一定要越界写在前面 ！！！
        }
        return count;
    }
}
/*
    贪心算法
    先排序两个数组
    当遍历两个数组
     当给予小于需求 且不越界的情况下
     给予的数字加加；
    满足条件 count ++;
 */