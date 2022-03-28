package leetcode.tree;

public class p572另一棵树的子树 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSametree(root, subRoot);
    }

    private boolean isSametree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) return false;
        return isSametree(root.left, subRoot.left) && isSametree(root.right, subRoot.right);


    }
}
