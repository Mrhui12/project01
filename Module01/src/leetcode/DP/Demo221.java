package leetcode.DP;

public class Demo221 {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, max = 0;
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    }
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max * max;
    }


}
