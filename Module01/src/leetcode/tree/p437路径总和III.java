package leetcode.tree;

public class p437路径总和III {
    @SuppressWarnings("ALL")
    public int pathSum(TreeNode root, int targetSum) {
        return root == null ? 0 : pathSum(root.right, targetSum) + pathSum(root.left,
                targetSum) + pathSumStartWithRoot(root, targetSum);
        //选择当前节点 或者递归左右节点加入路径
    }

    private int pathSumStartWithRoot(TreeNode root, int targetSum) {
        if (root == null) return 0;//从上到下 覆盖所有可能
        int count = root.val == targetSum ? 1 : 0;
        count += pathSumStartWithRoot(root.left, targetSum - root.val);//递归左右节点
        count += pathSumStartWithRoot(root.right, targetSum - root.val);
        return count;
    }
}
