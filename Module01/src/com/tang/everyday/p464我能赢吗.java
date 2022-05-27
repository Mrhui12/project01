package com.tang.everyday;

@SuppressWarnings("ALL")
public class p464我能赢吗 {
    private int n, m;
    private Boolean[] ok;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        n = maxChoosableInteger;
        m = desiredTotal;
        if (m <= n) return true;
        if (n * (1 + n) >> 1 < m) return false;
        ok = new Boolean[1 << n];
        return dfs(0, 0);
    }

    private boolean dfs(int index, int sum) {
        if (ok[index] != null) return ok[index];
        if (sum >= m) return (ok[index] = false);
        boolean res = false;
        for (int i = 0; i < n; i++) {
            if ((index & 1 << i) == 0) {
                int indexnext = index | 1 << i, sunnext = sum + 1 + i;
                if (sunnext >= m || !dfs(indexnext, sunnext)) {
                    res = true;
                    break;
                }
            }
        }
        ok[index] = res;
        return res;
    }
}
