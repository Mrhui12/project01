package leetcode.tree;

public class p530二叉搜索树的最小绝对差 {
    int min, pre;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return min;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre == -1)
            pre = root.val;
        else {
            min = Math.min(min, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}
