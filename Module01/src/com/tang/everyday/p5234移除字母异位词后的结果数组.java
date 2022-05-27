package com.tang.everyday;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class p5234移除字母异位词后的结果数组 {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> res = new LinkedList<>();
        if (n < 1) return res;
        for (String word : words) {
            res.add(word);
        }
        for (int i = n - 1; i > 0; i--) {
            String cur = words[i];
            String pre = words[i - 1];
            if (Anagrams(cur, pre))
                res.remove(i);
        }
        return res;
    }

    private boolean Anagrams(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        int[] dp = new int[26];
        for (int i = 0; i < word2.length(); i++) {
            dp[word1.charAt(i) - 'a']++;
            dp[word2.charAt(i) - 'a']--;
        }
        for (int i : dp) {
            if (i != 0) return false;
        }
        return true;
    }
}