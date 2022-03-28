package leetcode.Structure.arr;

public class Demo240_搜索一个2D矩阵2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length, n = matrix[0].length;


        int i = 0, j = n - 1;
        while (i < m && j > 0) {
            if (matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
            else if (matrix[i][j] == target)
                return true;
        }
        return false;
    }
}
