package com.tang.leetCodeHot100;

public class p48旋转图像 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int i1 = 0; i1 < (n + 1) / 2; i1++) {
                int temp = matrix[i][i1];
                matrix[i][i1] = matrix[n - i1 - 1][i];
                matrix[n - i1 - 1][i] = matrix[n - i - 1][n - i1 - 1];
                matrix[n - i - 1][n - i1 - 1] = matrix[i1][n - i - 1];
                matrix[i1][n - i - 1] = temp;
            }
        }

    }
}
