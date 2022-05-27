package com.tang.leetcode1.图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class p210课程表II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        HashSet<Integer>[] sets = new HashSet[numCourses];//创建一个哈希数组 大小为n
        int[] res = new int[numCourses];
        int[] death = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            sets[i] = new HashSet<>();//初始化每一个Hashset
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int[] prerequisite : prerequisites) {
            sets[prerequisite[1]].add(prerequisite[0]);
            death[prerequisite[0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (death[i] == 0)
                queue.offer(i);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int index = queue.poll();
            res[count++] = index;
            for (Integer num : sets[index]) {
                death[num]--;//前一个出来了 他就应该减去一
                if (death[num] == 0) queue.offer(num);
            }
        }
        if (count == numCourses) return res;
        return new int[0];
    }
}
// 当可选课程长度为0的时候 我们就让 直接返回 new int[0];
   /*
   创建一个 长度为n的 HashSet<Integer>[] sets= HashSet[n];
   初始化 每一个sets
   遍历数组 让第二个值加第一个
   并且第一个深度加一
   遍历所有的深度  当为0的加入
   之后当不为0
     出来 加入
     并且让set 里面的--
     当为0 加入

    */