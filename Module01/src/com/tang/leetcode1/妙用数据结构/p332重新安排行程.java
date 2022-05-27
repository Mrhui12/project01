package com.tang.leetcode1.妙用数据结构;

import java.util.*;

@SuppressWarnings("all")
public class p332重新安排行程 {
    private Map<String, PriorityQueue<String>> map = new HashMap<>();
    private List<String> ans = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dst = ticket.get(1);
            if (!map.containsKey(src)) {
                PriorityQueue<String> pq = new PriorityQueue<>();
                map.put(src, pq);
            }
            map.get(src).add(dst);
        }
        dfs("JFK");
        return ans;
    }

    private void dfs(String src) {
        PriorityQueue<String> pq = map.get(src);
        while (pq != null && !pq.isEmpty())
            dfs(pq.poll());
        ((LinkedList<String>) ans).addFirst(src);
    }
}
/*
   行程安排
   有一个多重映射优先集合
   遍历
   得到每一个的起始点 和1终点
   当没有这个起始点的时候
   创建以一个优先集合
   map.put(sec,pq);
   map.get(sec).add(dst);
   dfs ("JFK");
   reruen ans;

 */