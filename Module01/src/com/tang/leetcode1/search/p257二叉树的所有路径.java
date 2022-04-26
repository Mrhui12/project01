package com.tang.leetcode1.search;

import java.util.ArrayList;
import java.util.List;

public class p257二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }

    private void dfs(TreeNode root, List<String> res, String s) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(s);
            pathSB.append(Integer.toString(root.val));//整数变成字符串
            if (root.left == null && root.right == null)
                res.add(pathSB.toString());//变成字符串
            else {
                pathSB.append("->");
                dfs(root.left, res, pathSB.toString());//变成字符串
                dfs(root.right, res, pathSB.toString());
            }
        }
    }


}
/*
    这道题主要是字符串拼接
 */