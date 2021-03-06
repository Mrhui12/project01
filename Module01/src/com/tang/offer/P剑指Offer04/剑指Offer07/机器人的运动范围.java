package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 机器人的运动范围 {
    int n, m, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.k = k;
        this.m = m;
        this.n = n;
        visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);

    }

    private int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || si + sj > k || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }
}
