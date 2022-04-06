package com.tang.leetCodeHot100;

public class p最小路径和 {
    public int minPathSum(int[][] grid
    ) {
        int n = grid.length, m = grid[0].length;
        if (n == 0) return 0;
        int[][] dps = new int[n][m];
        dps[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dps[0][i] = dps[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            dps[i][0] = dps[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dps[i][j] = Math.min(dps[i - 1][j], dps[i][j - 1]) + grid[i][j];
            }
        }
        return dps[n-1][m-1];
    }
}
/*
动态规整
注意边界条件

 */