package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 股票的最大利润 {
    public static int maxProfit(int[] prices) {
        int min = Integer.MIN_VALUE, profit = 0;
        for (int price : prices) {
            min = Math.min(price, min);
            profit = Math.max(price - min, profit);
        }
        return  profit;
    }


}
