package com.tang.leetcode1.DP;

import java.util.Arrays;

@SuppressWarnings("all")
public class p322零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) return -1;
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++)
            dp[i] = amount + 2;
        dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i>=coin){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
          return dp[amount]==amount+2?-1:dp[amount];

    }
}
/*
        兑换零钱
        当长度为0的时候  -1
        新建一个dp数组 长度为amout+1
    因为要最小值    初试话让它为amount+2;
        让第一个等于0
        遍历
        遍历硬币的时候 要满足i>=ciomn
        动态条件为 dp[i]=min(dp[i],dp[i-cion]+1];
        返回 dp[amount];
 */