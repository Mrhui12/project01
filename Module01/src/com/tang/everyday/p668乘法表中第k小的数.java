package com.tang.everyday;

@SuppressWarnings("all")
public class p668乘法表中第k小的数 {
    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while (l < r) {
            int mid = (r + l) >> 1;
            if (count(m, n, mid) < k) l = mid + 1;
            else r = mid;
            if (l == r - 1) {
                if (count(m, n, l) >= k) r = l;
                break;
            }
        }
        return r;
    }

    private int count(int m, int n, int mid) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += Math.min(m, mid / i);
        }
        return ans;
    }
}
