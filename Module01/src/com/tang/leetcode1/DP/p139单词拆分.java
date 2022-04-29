package com.tang.leetcode1.DP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public class p139单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
       int n=s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0]=true;
        Set<String> set = new HashSet<>(wordDict);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[j]&&set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return  dp[n];
    }
}
/*
    给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 */
