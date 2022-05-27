package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("all")
public class NumArray {
    int[] tree;

    int lowbit(int x) {
        return x & -x;
    }

    int query(int x) {
        int ans = 0;
        for (int i = x; i > 0; i -= lowbit(i))
            ans += tree[i];
        return ans;
    }

    void add(int x, int u) {
        for (int i = x; i <= n; i += lowbit(i)) {
            tree[i] += u;

        }
    }
    int n;
    int[] num;

    public NumArray(int[] nums) {
        num = nums;
        n = nums.length;
        tree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            add(i + 1, num[i]);
        }
    }

    public void update(int index, int val) {
        add(index + 1, val - num[index]);
        num[index] = val;
    }

    public int sumRange(int left, int right) {
        return query(right + 1) - query(left);
    }
}
