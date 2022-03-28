package leetcode.Structure.Hashtable;

public class p566重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = n == 0 ? 0 : mat[0].length, count = 0;
        if (n == 0 || m == 0) return null;
        if (n * m != c * r) return mat;
        int[] nums = new int[n * m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[count++] = mat[i][j];
            }
        }
        count = 0;
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = nums[count++];
            }
        }
        return ans;
    }
}
