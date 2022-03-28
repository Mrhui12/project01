package leetcode.tree;

public class p99恢复二叉搜索树 {
    private TreeNode x = null;
    private TreeNode y = null;
    private TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        dfs(root);
        if (x != null && y != null) {
            int temp = x.val;

            x.val = y.val;
            y.val = temp;
        }

    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre == null)
            pre = root;
        else {
            if (pre.val > root.val) {
                y = root;
                if (x == null) x = pre;
            }
            pre = root;

        }
        dfs(root.right);
    }

}
