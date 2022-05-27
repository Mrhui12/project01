package com.tang.leetcode1.图;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class p785判断二分图 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i] != 0) continue;
            queue.offer(i);
            visited[i] = 1;
            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int j : graph[node]) {
                    if (visited[j] == visited[node]) return false;
                    if (visited[j] == 0) {
                        visited[j] = -visited[node];
                        queue.offer(j);
                    }
                }
            }
        }
        return true;
    }
}
/*
  二分图
   判断一个图是否可以二分
    1.长度 建立一个长度长的状态数组
    判断是否已经遍历过了
    2.简历一个队列 BFS
    3.遍历 i 当 当前状态列表不为0 直接跳过 为0
    加入链表 并且改变状态值 为1
    当链表不为空 循环
    poll
    遍历出来值的数组 当数组状态值等于当前的 直接返回false
    如果状态为0 加入链表 并且改变状态值为当前相反数

    所有介绍 返回true

 */