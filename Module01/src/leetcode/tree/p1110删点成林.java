package leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p1110删点成林 {
    private List<TreeNode> forest;
    private Set<Integer> dict;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        forest = new ArrayList<>();
        dict = new HashSet<>();
        for (int i : to_delete) {
            dict.add(i);
        }
        root = helper(root);
        if (root != null)
            forest.add(root);
        return forest;
    }

    private TreeNode helper(TreeNode root) {
        if (root == null) return null;
        root.left = helper(root.left);
        root.right = helper(root.right);
        if (dict.contains(root.val)) {
            if (root.left != null)
                forest.add(root.left);
            if (root.right != null)
                forest.add(root.right);
            root = null;
        }
        return root;
    }
}
