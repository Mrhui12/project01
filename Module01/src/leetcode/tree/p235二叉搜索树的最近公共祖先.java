package leetcode.tree;

public class p235二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (root.val - p.val) * (root.val - q.val) <= 0 ? root : root.val - p.val < 0 ? lowestCommonAncestor(root.right, p, q) :
                lowestCommonAncestor(root.left, p, q);
    }
}
