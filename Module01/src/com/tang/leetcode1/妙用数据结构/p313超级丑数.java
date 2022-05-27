package com.tang.leetcode1.妙用数据结构;

import java.util.PriorityQueue;

@SuppressWarnings("all")
public class p313超级丑数 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long res = 1;
        for (int i = 1; i < n; i++) {
            for (int prime : primes) {
                queue.add(prime * res);
            }
            res = queue.poll();
            while (!queue.isEmpty() && res == queue.peek()) queue.poll();//防止同样的丑数入队
        }
        return (int) res;
    }
}
/*
使用 优先队列
 让初始值等于1
  遍历 n次
  当
 */