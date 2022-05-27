package com.tang.everyday;

import java.util.List;

@SuppressWarnings("all")
public class p965单值二叉树 {
    int val = -1;

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        if (val == -1) val = root.val;
        if (root != null) {
            if (root.val != val) return false;
            isUnivalTree(root.left);
            isUnivalTree(root.right);
        }
        return true;
    }
}
