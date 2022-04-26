package com.tang.leetcode1.search;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class p51N皇后 {
    private int n;
    private boolean[] col;
    private boolean[] main;
    private boolean[] sub;
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        if (n <= 0) return res;
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
            res.add(new ArrayList(path));
        }
        for (int i = 0; i < n; i++) {
            if (col[i] || main[row - i + n - 1] || sub[i + row]) {
                continue;
            } else {
                path.addLast(i);
                col[i] = true;
                main[row - i + n - 1] = true;
                sub[i + row] = true;
                dfs(row + 1, path);
                path.removeLast();
                col[i] = false;
                main[row - i + n - 1] = false;
                sub[i + row] = false;
            }
        }
    }

    private List<String> conver2board(Deque<Integer> path) {
        List<String> ans = new ArrayList<>();
        for (Integer integer : path) {
            StringBuilder row = new StringBuilder();
            row.append(".".repeat(Math.max(0, n)));
            row.replace(integer, integer + 1, "Q");
            ans.add(row.toString());
        }
        return ans;
    }
}
/*
        n皇后回溯法
        处理条件
        多了很多
        列 col[i] n个
        主对角线[row-i+n-1] 2n-1个
        副对角线[row+i] 2n-1个
        当到n行的时候 加入答案 return
        满足所有条件 修改在状态值 将符合的列数加入答案;递归row+1行 回溯

        列转变为答案
        用private List<String> conver2board(Deque<Integer> path) {
        List<String> ans = new ArrayList<>();
        for (Integer integer : path) {
            StringBuilder row = new StringBuilder();
            row.append(".".repeat(Math.max(0, n)));//注意是双引号
            row.replace(integer, integer + 1, "Q");
            ans.add(row.toString());//最后要ToString();
        }
        return ans;
    }
 */