package com.tang.leetCodeHot100;

public class p121买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            max = Math.max(price - min, max);
            min = Math.min(min, price);
        }
        return max;
    }
}
/*
更新最大值
跟新最小值
 */