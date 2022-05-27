package com.tang.leetcode1.DP;
@SuppressWarnings("all")
public class p121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int price : prices) {
            max=Math.max(max,price-min);
            min=Math.min(price,min);
        }
        return max;
    }
}
/*
先让最小值很大
        更新最大值 和最小值
 */