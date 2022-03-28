package leetcode.tree;

public class p543二叉树的直径 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);//可以是这个 如果不是最大 他会被递归过程中干掉
        return ans - 1;
    }

    private int depth(TreeNode root) {
        if (root == null)
            return 0;//末节点
        int L = depth(root.left), R = depth(root.right);//递归
        ans = Math.max(ans, L + R + 1);//更新ans
        return Math.max(L, R) + 1;//返回一个点的节点深度
    }
}
