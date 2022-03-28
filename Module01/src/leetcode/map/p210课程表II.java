package leetcode.map;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class p210课程表II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        HashSet<Integer>[] adj = new HashSet[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new HashSet<>();
        }
        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) {
            adj[p[1]].add(p[0]);
            inDegree[p[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }
        int[] res = new int[numCourses];
        int count = 0;
        while (!queue.isEmpty()) {
            int head = queue.poll();
            res[count++] = head;
            HashSet<Integer> temp = adj[head];
            for (Integer nexthead : temp) {
                inDegree[nexthead]--;
                if (inDegree[nexthead] == 0)
                    queue.offer(nexthead);
            }

        }
        if (count == numCourses) return res;
        return new int[0];

    }
}
