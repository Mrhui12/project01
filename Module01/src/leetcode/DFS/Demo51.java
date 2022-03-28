package leetcode.DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Demo51 {
    //n皇后
    private int n;
    private boolean[] col;
    private boolean[] main;
    private boolean[] sub;
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        this.n = n;
        this.col = new boolean[n];
        this.main = new boolean[2 * n - 1];
        this.sub = new boolean[2 * n - 1];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(0, path);
        return res;
    }

    private void dfs(int row, Deque<Integer> path) {
        if (row == n) {
            List<String> board = conver2board(path);
            res.add(board);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!col[i] && !main[row - i + n - 1] && !sub[row + i]) {
                path.addLast(i);
                col[i] = true;
                main[row - i + n - 1] = true;
                sub[row + i] = true;
                dfs(row + 1, path);

                col[i] = false;
                main[row - i + n - 1] = false;
                sub[row + i] = false;
                path.removeLast();
            }
        }
    }

    private List<String> conver2board(Deque<Integer> path) {
        List<String> board = new ArrayList<>();
        for (Integer num : path
        ) {
            StringBuilder row = new StringBuilder();
            row.append(".".repeat(Math.max(0, n)));
            row.replace(num, num + 1, "Q");
            board.add(row.toString());


        }
        return board;
    }
}
