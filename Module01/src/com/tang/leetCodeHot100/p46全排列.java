package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p46全排列 {
    @SuppressWarnings("all")
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<Integer>();
        for (int num :
                nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public static void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if (first == n-1) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            backtrack(n, output, res, first + 1);
            Collections.swap(output, first, i);
        }
    }
}
