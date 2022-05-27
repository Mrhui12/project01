package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p235二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = p.val - root.val;
        int b = q.val - root.val;
        if (a * b <= 0) return root;
        else {
            if (a > 0) return lowestCommonAncestor(root.right, p, q);
            else return lowestCommonAncestor(root.left, p, q);
        }
    }
}
/*利用特性

 */
