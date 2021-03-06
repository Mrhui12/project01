package leetcode.DP;

public class Demo279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
            for (int j = 1; j * j <= i; j++) {

                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }

        }
        return dp[n];
    }
}
