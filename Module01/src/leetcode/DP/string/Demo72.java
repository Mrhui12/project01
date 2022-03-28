package leetcode.DP.string;

public class Demo72 {
    public static int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        if (n * m == 0) {
            return m + n;
        }
        int[][] dps = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dps[i][0] = i;

        }
        for (int i = 0; i <= m; i++) {
            dps[0][i] = i;

        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                dps[i][j] = Math.min(word1.charAt(i - 1) == word2.charAt(j - 1) ? dps[i - 1][j - 1] : dps[i - 1][j - 1] + 1, Math.min(dps[i - 1][j] + 1, dps[i][j-1] + 1));
            }
        }

        return dps[n][m];
    }

    public static void main(String[] args) {
        String str1 = "horse", str2 = "ros";
        System.out.println(minDistance(str1, str2));
    }
}
