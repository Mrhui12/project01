package leetcode.DP.beibao;

public class Demo474plus {
    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= length; i++) {
            int[] ZerosOnes = getZerosOnes(strs[i]);
            int zeros = ZerosOnes[0], Ones = ZerosOnes[1];
            for (int j = m; j >= zeros; j--) {
                for (int k = n; k >= Ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - Ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] getZerosOnes(String str) {
        int[] ZerosOnes = new int[2];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            ZerosOnes[str.charAt(i) - '0']++;
        }
        return ZerosOnes;
    }
}
