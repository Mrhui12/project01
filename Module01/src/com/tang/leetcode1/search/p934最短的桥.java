package com.tang.leetcode1.search;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class p934最短的桥 {

    public int shortestBridge(int[][] grid) {
        int[][] arr = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> queue = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0) return 0;
        boolean onegrid = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (onegrid) break;
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, queue, arr);
                    onegrid = true;
                }
            }
        }
        int x = 0, y = 0;
        int length = 0;
        while (!queue.isEmpty()) {
            length++;
            int size = queue.size();
            while (size > 0) {
                size--;
                int[] pos = queue.pollFirst();
                x = pos[0];
                y = pos[1];
                for (int[] ints : arr) {
                    int newi = x + ints[0];
                    int newj = y + ints[1];
                    if (newi >= 0 && newi < grid.length && newj >= 0 && newj < grid[0].length) {
                        if (grid[newi][newj] == 2) continue;
                        if (grid[newi][newj] == 0) {
                            queue.addLast(new int[]{newi, newj});
                            grid[newi][newj] = 2;
                        } else return length;
                    }
                }
            }
        }
        return length;
    }

    private void dfs(int[][] grid, int i, int j, Deque<int[]> queue, int[][] arr) {
        grid[i][j] = 2;
        for (int[] ints : arr) {
            int newi = ints[0] + i;
            int newj = ints[1] + j;
            if (newi >= 0 && newi < grid.length && newj >= 0 && newj < grid[0].length) {
                if (grid[newi][newj] == 1) dfs(grid, newi, newj, queue, arr);
                if (grid[newi][newj] == 2) continue;
                if (grid[newi][newj] == 0) {
                    queue.push(new int[]{newi, newj});
                    grid[newi][newj] = 2;
                }
            }
        }
    }
}
/*
    能用ArrayDeque的就用这个；
    思路 先DFS遍历数组找到第一个道
    找到后就直接break
    dfs过程中 遍历过的直接grid==2;
    当为2时直接跳过
    当为一的时候dfs 当为0的时候加入队列 并且让他们为2 找到

    之后BFS 初始化长度为0
    当队列不为空 直接 长度++；
    记录它的长度 循环导出
    新的结果看是否为2 是就直接跳过
    为0就加入队列 并且变成2
    为1直接返回结果

 */