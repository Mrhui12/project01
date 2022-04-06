package com.tang.leetCodeHot100;

public class p72编辑距离 {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        if (m == 0 || n == 0)
            return m == 0 ? n : m;
        int[][] dps = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dps[i][0] = i;
        }
        for (int i = 1; i <= n; i++) {
            dps[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) dps[i][j] = dps[i - 1][j - 1];
                else {
                    dps[i][j] = Math.min(Math.min(dps[i - 1][j - 1], dps[i - 1][j]), dps[i][j - 1]) + 1;
                }
            }
        }
        return dps[m][n];
    }
}
/*
动态规划其实不难
注意边界条件
两个字要变成一样的
 */