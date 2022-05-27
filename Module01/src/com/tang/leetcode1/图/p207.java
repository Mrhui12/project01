package com.tang.leetcode1.图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("ALL")
public class p207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return true;
        HashSet<Integer>[] sets = new HashSet[numCourses];
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            sets[i] = new HashSet<>();
        }
        int[] depth = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            sets[prerequisite[1]].add(prerequisite[0]);
            depth[prerequisite[0]]++;
        }
        Queue<Integer> lists = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (depth[i] == 0) lists.offer(i);
        }
        if (lists.isEmpty()) return false;
        while (!lists.isEmpty()) {
            int node = lists.poll();
            count++;
            for (int i : sets[node]) {
                depth[i]--;
                if (depth[i] == 0) lists.offer(i);

            }
        }
        return count == numCourses;
    }
}
