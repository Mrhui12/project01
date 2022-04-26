package com.tang.leetcode1.search;

        import java.util.ArrayList;
        import java.util.List;

public class p77组合 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k > n || k <= 0)
            return res;
        List<Integer> ans = new ArrayList<>();
        dfs(n, k, 1, res, ans);
        return res;
    }

    private void dfs(int n, int k, int index, List<List<Integer>> res, List<Integer> ans) {
        //减枝
        if(ans.size()+(n-index+1)<k)return;
        if (ans.size() == k) {
            res.add(new ArrayList<>(ans));//不要xie<>
            return;
        }
        for (int i = index; i <= n; i++) {
            ans.add(i);
            dfs(n, k, i + 1, res, ans);
            ans.remove(ans.size() - 1);

        }
    }
}
/*
    回溯法
    先考虑 需要的长度是否大于N 或者小于等于0
    dfs
    当结果达到k 将结果加入res 并且返回
    从index开始遍历
    加入i
    递归 i+1 ? 因为不需要重复的家国
去除最后一个
 */