package leetcode.tree;

public class p404左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;

    }

    private int dfs(TreeNode root) {
        int ans = 0;
        if (root.left != null) {
            ans += isLeafNode(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null && !isLeafNode(root.right)) {//如果右边子节点还有左右节点
            ans += dfs(root.right);
        }
        return ans;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }//判断是否为最底下左边节点
}
/*
1.写一个判断传入节点是否子节点都有的函数
2.如果左节点不为空，着递归左节点的子左节点，直到为空就加上左节点
2.判断右节点是否为空&&是否左右节点都还有
递归右节点
 */