package leetcode.DFS;

public class Demo79 {
    public boolean exist(char[][] borad, String word) {
        int h = borad.length, w = borad[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(borad, visited, i, j, word, 0);
                if (flag) {
                    return true;

                }
            }
        }
        return false;
    }

    private boolean check(char[][] borad, boolean[][] visited, int i, int j, String word, int k) {
        if (borad[i][j] != word.charAt(k)) {
            return false;
        } else if (k == word.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions
        ) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < borad.length && newj >= 0 && newj < borad[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(borad, visited, newi, newj, word, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }

        }
        visited[i][j] = false;
        return result;
    }
}
