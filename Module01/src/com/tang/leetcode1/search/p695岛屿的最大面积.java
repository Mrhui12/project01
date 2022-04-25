package com.tang.leetcode1.search;

public class p695岛屿的最大面积 {
    public int maxAreaofland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {

                    max = Math.max(max, dfs(i, j, m, n, grid));
                }
            }
        }
        return max;
    }

    private int dfs(int i, int j, int m, int n, int[][] grid) {
        grid[i][j] = 2;
        int num = 1;
        int[][] arr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] ints : arr) {
            int newi = i + ints[0];
            int newj = j + ints[1];
            if (newi < m && newi >= 0 && newj < n && newj >= 0 && grid[newi][newj] == 1) {
                num += dfs(newi, newj, m, n, grid);
            } else return 0;
        }
        return num;
    }
}
/*
        深度优先遍历
        遍历数组 判断是否为1 比较最大值
        深度优先遍历 处理边界条件
        让看过的 ==2
        1+=要便利的
        返回结果
 */