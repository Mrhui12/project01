package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("ALL")
public class p566重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m*n!=r*c)return mat;
        int[][] ans = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = i * n + j;
                ans[a / c][a % c] = mat[i][j];
            }
        }
        return ans;
    }
}
