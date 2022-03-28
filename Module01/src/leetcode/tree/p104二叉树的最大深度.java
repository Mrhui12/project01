package leetcode.tree;

public class p104二叉树的最大深度 {
    public int maxDepth(TreeNode root) {

        return root == null ? 0 : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));//递归
    }
}
