package com.tang.leetcode1.贪心;

public class p122买卖股票的最佳时机2 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int pre = prices[0];
        for (int price : prices) {
            if (price > pre) {
                max += price - pre;
            }
            pre = price;

        }
        return max;
    }
}
