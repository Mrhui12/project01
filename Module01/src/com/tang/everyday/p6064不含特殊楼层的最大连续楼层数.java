package com.tang.everyday;

import java.util.Arrays;

@SuppressWarnings("all")
public class p6064不含特殊楼层的最大连续楼层数 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        if (special.length >= top - bottom + 1) return 0;
        Arrays.sort(special);
        int max = 0;
        for (int i = 1; i < special.length; i++) {
            max = Math.max(special[i] - special[i - 1] - 1, max);
        }
        max = Math.max(Math.max(top - special[special.length - 1], max), special[0] - bottom);
        return max;
    }
}
