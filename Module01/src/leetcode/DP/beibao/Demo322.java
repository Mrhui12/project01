package leetcode.DP.beibao;

import java.util.Arrays;

public class Demo322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }

        }
        int ans= dp[amount] > amount ? -1 : dp[amount];
        return ans;
    }

    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        int ans=coinChange(coins,amount);
        System.out.println(ans);
    }

}

