package com.tang.everyday;

@SuppressWarnings("all")
public class p6065按位与结果大于零的最长组合 {
    public int largestCombination(int[] candidates) {
        if (candidates.length == 0) return 0;
        int[] cnt = new int[32];
        for (int candidate : candidates) {
            for (int i = 0; i < 32; i++) {
                if (((1 << i) & candidate) > 0) cnt[i]++;
            }
        }
        int max = 0;
        for (int i : cnt) {
            max = Math.max(max, i);
        }
        return max;
    }
}
