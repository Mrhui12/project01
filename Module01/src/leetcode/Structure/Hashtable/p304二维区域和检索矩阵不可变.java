package leetcode.Structure.Hashtable;

public class p304二维区域和检索矩阵不可变 {
    int[][] dps;

    public p304二维区域和检索矩阵不可变(int[][] matrix) {
        int n = matrix.length, m = n == 0 ? 0 : matrix[0].length;
        dps = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dps[i][j] = dps[i - 1][j] + dps[i][j - 1] - dps[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dps[row2 + 1][col2 + 1] - dps[row2 + 1][col1] - dps[row1][col2 + 1] + dps[row1][col1];
    }

}
