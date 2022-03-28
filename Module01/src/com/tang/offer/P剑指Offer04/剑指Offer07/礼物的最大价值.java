package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        if (n == 0 || m == 0) return 0;
        for (int i = 1; i < m; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[n - 1][m - 1];
    }
}
//动态规整
/*
想到了 动态方程
也想到了边界条件
应该从上到下循环遍历
不然反过来不知道具体值

 */