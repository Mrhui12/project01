package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 二叉树中和为某一值的路径 {
    LinkedList<Integer> path;
    List<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        path = new LinkedList<>();
        res = new ArrayList<>();
        repath(root, target);
        return res;
    }

    private void repath(TreeNode root, int target) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (root.right == null && root.left == null && target == 0) res.add(new LinkedList<>(path));
        repath(root.left, target);
        repath(root.right, target);
        path.removeLast();
    }


}
/*
采用前序遍历 先判断节点 在判断右子树每次到一个节点就先判断是否为空 再加入路径
同时target 也减去节点值
如果此时 就为叶子节点 并且target==0;
将这条路路径复制 到res 用 new LinkedList<>(path); 不用res.add(path),因为后续的回溯path的值会变
之后在左右子节点递归
递归之后如果是 寻求新的路径 返回上一节点需要删除当前节点 path.removeLast(); LinkedList才有这个功能；
 */