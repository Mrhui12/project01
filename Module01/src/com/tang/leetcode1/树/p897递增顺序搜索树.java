package com.tang.leetcode1.树;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@SuppressWarnings("all")
public class p897递增顺序搜索树 {
    List<TreeNode> lists = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        dfs(root);
        TreeNode res = new TreeNode(0);
        TreeNode ans = res;
        for (TreeNode list : lists) {
            ans.right = list;
            list.left = null;
            ans = list;
        }
        return res.right;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        lists.add(root);
        dfs(root.right);
    }
}
/*
    思路 中序遍历 节点加入链表
    然后新的数遍历链表
    避免节点产生 改变 的是链表值；
 */