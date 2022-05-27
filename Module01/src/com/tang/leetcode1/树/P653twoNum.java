package com.tang.leetcode1.树;

import java.util.*;

public class P653twoNum {
    Set<Integer> set= new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        if(set.contains(k-root.val))return true;
        set.add(root.val);
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}
