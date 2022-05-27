package com.tang.everyday;

import java.util.*;

@SuppressWarnings("all")
class CountIntervals {
    private List<int[]> res;

    public CountIntervals() {
        this.res = new LinkedList<>();
    }

    public void add(int left, int right) {
        res.add(new int[]{left, right});
    }

    public int count() {
        int[][] arr = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = arr[0][1] - arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1][1] > arr[i][0])
                count += (arr[i][1] - arr[i - 1][1] + 1);
            else count += arr[i][1] - arr[i][0] + 1;
        }
        return count;
    }
}
