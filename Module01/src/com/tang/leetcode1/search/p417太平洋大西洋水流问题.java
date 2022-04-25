package com.tang.leetcode1.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p417太平洋大西洋水流问题 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canRaechX = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(canRaechX, heights, i, 0);
            dfs(canReachP, heights, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(canRaechX, heights, 0, i);
            dfs(canReachP, heights, m - 1, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canRaechX[i][j] == true && canReachP[i][j] == true)
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;
    }

    private void dfs(boolean[][] canRaechX, int[][] heights, int i, int j) {
        if (canRaechX[i][j] == true) return;
        canRaechX[i][j] = true;
        int[][] arr = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int[] ints : arr) {
            int newi = i + ints[0];
            int newj = j + ints[1];
            if (newi >= 0 && newi < heights.length && newj < heights[0].length && newj >= 0&&heights[newi][newj] >= heights[i][j]) {
                 dfs(canRaechX, heights, newi, newj);
            }
        }
    }
}
/*
        水往高出流
        反向思维
        从大西洋或者太平洋出发
        往内部遍历
        如果遍历过就返回

        如果 不越界 且里面的数字大于当前的 就可以 继续作新的点遍历
        在主函数内
        遍历结果
        如果两种结果都为true 将结果加入到res

 */