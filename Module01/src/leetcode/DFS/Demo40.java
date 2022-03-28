package leetcode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo40 {

    List<List<Integer>> result = new ArrayList();
    List<Integer> path = new ArrayList();
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] cadidates, int target) {
        Arrays.sort(cadidates);
        backTracking(cadidates, target, 0);
        return result;
    }

    private void backTracking(int[] cadidates, int target, int index) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < cadidates.length; i++) {
            if (i > index && cadidates[i] == cadidates[i - 1]) {
                continue;
            }
            path.add(cadidates[i]);
            sum += cadidates[i];
            backTracking(cadidates, target, i + 1);
            sum -= cadidates[i];
            path.remove(path.size() - 1);
        }
    }

}
