package com.tang.offer.P剑指Offer04;

public class 二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;//注意索引问题
        if (n == 0 || m == 0)
            return false;
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] == target) return true;
            else i++;
        }
        return false;
    }
}
