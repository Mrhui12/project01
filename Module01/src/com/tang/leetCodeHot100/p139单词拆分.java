package com.tang.leetCodeHot100;

import java.util.HashSet;
import java.util.List;
import java.util.*;

public class p139单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dps = new boolean[n + 1];
        dps[0] = true;
        Set<String> set = new HashSet<>(wordDict);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {//注意范围得从0开始
                if (dps[j] && set.contains(s.substring(j, i))) {
                    dps[i] = true;
                    break;//退出内层循环 找到了匹配的
                }
            }
        }
        return dps[n];
    }
}
/*
    背包问题
    动态规整
    创建一个N+1长的动态数组
    并让初始值为true
    创建一个Hashset 把字典放进去
    遍历长度
    在内存循环 如果dps[j]==ture&&set包含j~i的s子字符 直接 dps[i]等会TRUE 只要I等于了true直接break

 */