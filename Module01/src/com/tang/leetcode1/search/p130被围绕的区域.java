package com.tang.leetcode1.search;

public class p130被围绕的区域 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean Flag = i == 0 || i == m - 1 || j == 0 || j == n - 1;
                if (Flag && board[i][j] == 'O')
                    dfs(i, j, board);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]=='O')
                    board[i][j]='X';
                else if (board[i][j]=='F')
                board[i][j]='O';
            }
        }
    }

    private void dfs(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        } else board[i][j] = 'F';
        dfs(i - 1, j, board);
        dfs(i + 1, j, board);
        dfs(i, j + 1, board);
        dfs(i, j - 1, board);
    }
}
/*
    从边界判断
    让便捷的O都变成F
    在遍历
 */