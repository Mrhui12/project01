package leetcode.DP;

public class Demo524 {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        if (n == 0 || m == 0) {
            return null;
        }
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = mat[i][j] == 0 ? 0 : Integer.MAX_VALUE / 2;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0) {
                    ans[i][j] = Math.min(ans[i][j], ans[i - 1][j] + 1);
                }
                if (j > 0) {
                    ans[i][j] = Math.min(ans[i][j], ans[i][j - 1] + 1);
                }

            }

        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i < n - 1) {
                    ans[i][j] = Math.min(ans[i][j], ans[i + 1][j] + 1);
                }
                if (j < m - 1) {
                    ans[i][j] = Math.min(ans[i][j], ans[i][j + 1] + 1);
                }
            }
        }
        return ans;
    }
}
