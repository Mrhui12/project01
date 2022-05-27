package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p188买卖股票的最佳时机IV {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;
        if (k >= n) return maxProfit(prices);
        int[] dpbuy = new int[k + 1];
        int[] dpsell = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            dpbuy[i] = Integer.MIN_VALUE;
            dpsell[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dpbuy[j] = Math.max(dpbuy[j], dpsell[j - 1] - prices[i]);
                dpsell[j] = Math.max(dpsell[j], dpbuy[j] + prices[i]);
            }
        }
        return dpsell[k];
    }

    private int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
}
/*
    当长度低于2直接返回0
    当k 大于长度
    只要有利益就买
    当然后定义两个dp数组 一个买 一个 卖的利益
    初始化 让 买的所有利益最小 让卖的所有利益为0
    之后遍历 动态规整
    遍历数组 并且在里面 遍历k   更新buy sell
     for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dpbuy[j] = Math.max(dpbuy[j], dpsell[j - 1] - prices[i]);
                dpsell[j] = Math.max(dpsell[j], dpbuy[j] + prices[i]);
            }
        }
 */