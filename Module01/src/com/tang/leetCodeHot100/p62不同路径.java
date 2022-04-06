package com.tang.leetCodeHot100;

public class p62不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] dps = new int[m][n];
        for (int i = 0; i < m; i++) {
            dps[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dps[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dps[i][j] = dps[i - 1][j] + dps[i][j - 1];
            }
        }
        return dps[m-1][n-1];
    }

}
/*
动态规整
当前的dps[i][j]=dps[i-1][j]+dps[i][j-1];
注意边界条件 一行 第一列只能等于1
 */