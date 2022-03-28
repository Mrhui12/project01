package leetcode.Part10;

public class Demo338_计算部分 {
    public int[] maxProduct(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = (i & 1)==1? dp[i - 1] + 1 : dp[i >> 1];
        }
        return dp;
    }
}
