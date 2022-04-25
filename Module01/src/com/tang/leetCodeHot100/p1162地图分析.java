package com.tang.leetCodeHot100;

import java.util.ArrayDeque;
import java.util.Queue;

public class p1162地图分析 {

    public  static int maxDistance(int[][] grid) {

        Queue<int[]> quque = new ArrayDeque<>();
        int n = grid.length;
        if (n == 0) return 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) quque.add(new int[]{i, j});
            }
        }
        if (quque.isEmpty() || quque.size() == n*n) return -1;
        int distance = -1;
        int[][] arr = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        while (!quque.isEmpty()) {
            distance++;
            int length = quque.size();

            for (int i = 0; i < length; i++) {
                int[] position = quque.poll();
                int r = position[0], c = position[1];
                for (int[] ints : arr) {
                    int newr = r + ints[0];
                    int newc = c + ints[1];
                    if (inarea(newr, newc, grid) && grid[newc][newc] == 0) {
                        quque.add(new int[]{newr, newc});
                        grid[newc][newc] = 2;
                    }
                }
            }
        }
        return distance;
    }

    private static boolean inarea(int newr, int newc, int[][] grid) {
        return newr >= 0 && newr < grid.length && newc >= 0 && newc < grid[0].length;
    }

    public static void main(String[] args) {
        int[][] grid={{1,0,1},{0,0,0},{1,0,1}};
        System.out.println(maxDistance(grid));

    }
}
/*
思路
最大距离
广度优先搜索
先看矩阵是否为0 是就直接返回0
再便利所有的点 遇到一就将横纵坐标加入到队列
最后看队列是否为0 或者n*n
是就返回-1；
反之 distance=-1
队列不为空
distance++
szie 大出队列
记录横纵坐标 再以横纵坐标 上下左右广度优先便利遍 当满足边界条件和为没有便利过时候 吧新的点记作2 入读列

最后返回distance
 */