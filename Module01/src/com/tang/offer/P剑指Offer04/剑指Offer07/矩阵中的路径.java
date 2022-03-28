package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 矩阵中的路径 {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(words, board, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[] words, char[][] board, int i, int j, int i1) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[i1])
            return false;
        if (i1 == words.length - 1) return true;

       board[i][j]='\0';

       boolean res = dfs(words, board, i - 1, j, i1 + 1)
                || dfs(words, board, i, j - 1, i1 + 1)
                || dfs(words, board, i + 1, j, i1 + 1)
                || dfs(words, board, i, j + 1, i1 + 1);
        board[i][j] = words[i1];//回溯 递归里面改变的再变回来
        return res;
    }
}
