package com.tang.leetCodeHot100;

import java.util.*;

public class p39组合总和 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        if (candidates.length == 0 || candidates[0] > target) return lists;
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for (int candidate : candidates) {
            res1.add(candidate);
        }
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                if (target % candidates[i] == 0) {
                    int temp = target / candidates[i];
                    for (int i1 = 0; i1 < temp; i1++) {
                        res2.add(candidates[i]);
                    }
                    lists.add(res2);
                    res2.clear();
                } else if (res1.contains(target % candidates[i])) {
                    int temp = (target - target % candidates[i]) / candidates[i];
                    res2.add(target % candidates[i]);
                    for (int i1 = 0; i1 < temp; i1++) {
                        res2.add(candidates[i]);
                    }
                    lists.add(res2);
                    res2.clear();
                }
            }
            else break;
        }
        return lists;
    }
}
