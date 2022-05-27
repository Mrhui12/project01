package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("all")
public class p240搜索二维矩阵II {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (target == matrix[i][j]) return true;
            else if (target > matrix[i][j]) i++;
            else if (target < matrix[i][j]) j--;
        }
        return false;
    }
}
