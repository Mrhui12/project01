package leetcode.DP.string;

public class Demo650 {
    public int minSteps(int n) {
        int[] dps = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dps[i] = i;
            for (int j = 2; j * j < n; j++) {
                if (i % j == 0) {
                    dps[i] = dps[j] + dps[i / j];
                    break;
                }
            }

        }
        return dps[n];
    }
}
