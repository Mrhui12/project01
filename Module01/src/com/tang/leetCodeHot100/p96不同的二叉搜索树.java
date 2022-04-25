package com.tang.leetCodeHot100;

public class p96不同的二叉搜索树 {
    public int numTrees(int n) {
        int[] dps = new int[n + 1];
        dps[0] = 1;
        dps[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                dps[i] += dps[j - 1] * dps[i - j];
            }
        }
        return dps[n];
    }
}
/*
总的数目 为每个点为节点 产生的数目之和
当 i为节点时
i的左边有i-1个数 右边有n-i个数
G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
动态规整
卡特兰数
dps[i]+=dps[j-1]*dps[i-j]
 */