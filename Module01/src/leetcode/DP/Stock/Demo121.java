package leetcode.DP.Stock;

public class Demo121 {
    public int maxProfit(int[] prices) {
int n=prices.length;

        int max=0,min=prices[0];
        for (int i = 0; i < n; i++) {
            min=Math.min(prices[i],min);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
