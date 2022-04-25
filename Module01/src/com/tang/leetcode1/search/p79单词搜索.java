package com.tang.leetcode1.search;

public class p79单词搜索 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int m = board.length;
        int n = board[0].length;
        boolean find = false;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j, board, word, find, visited, 0);
            }
        }
        return find;
    }

    private void dfs(int i, int j, char[][] board, String word, boolean find, boolean[][] visited, int pos) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (visited[i][j] || find || board[i][j] != word.charAt(pos))
            return;
        if (pos == word.length() - 1) {
            find = true;
            return;
        }
        visited[i][j] = true;
        int[][] arr = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] ints : arr) {
            i = i + ints[0];
            j = j + ints[1];
            dfs(i, j, board, word, find, visited, pos + 1);
        }
        visited[i][j] = false;
    }

}
/*
    查找单词
    初始判断
    是否为0
    是的话就返回false
    遍历 看是否访问加上是否相等 如果是就返回结果

     内部回溯判断
     访问过得单词用false
     回溯 当的等于单词长的时候 就返回true

 */