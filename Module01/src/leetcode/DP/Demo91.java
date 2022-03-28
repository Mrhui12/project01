package leetcode.DP;

public class Demo91 {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i) - '0' != 0) {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && s.charAt(i - 1) != '0' && ((s.charAt(i - 1) - '0') * 10 + s.charAt(i) - '0') < 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
