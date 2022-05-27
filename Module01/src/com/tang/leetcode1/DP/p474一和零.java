package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p474一和零 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zeroSize = countZeroOnes(str)[0];
            int oneSize = countZeroOnes(str)[1];
            for (int j = m; j >= zeroSize; j--) {
                for (int i = n; i >= oneSize; i--) {
                    dp[j][i] = Math.max(dp[j][i], dp[j - zeroSize][i - oneSize] + 1);

                }
            }
        }
        return dp[m][n];
    }

    private int[] countZeroOnes(String str) {
        int[] ans = new int[2];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') ans[0]++;
            else ans[1]++;
        }
        return ans;
    }
}
