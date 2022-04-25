package com.tang.leetcode1.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p347前K个高频元素 {
    public List<Integer> topKFrequent(int[] nums, int k){
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] list = new List[nums.length + 1];
        for (Integer integer : map.keySet()) {
            int i=map.get(integer);
            if (list[i]==null)
                list[i]=new ArrayList();
            list[i].add(integer);
        }
        for (int i=list.length-1;i>=0&&res.size()<k;i--){
            if (list[i]==null)continue;
            res.addAll(list[i]);
        }
        return res;
    }
}
/*
        思路 桶排序
        利用hashmap 遍历得到 每次数的出现次数
        在根据 频率数大小 创建集合 添加相应数据
        再遍历数组 从大到小
        知道res.zise ==k
        返回res;
 */