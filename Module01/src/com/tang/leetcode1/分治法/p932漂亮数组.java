package com.tang.leetcode1.分治法;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p932漂亮数组 {
    Map<Integer, int[]> map = new HashMap<>();

    public int[] beautifulArray(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int[] result = new int[n];
        int index = 0;
        if (n != 0) {
            for (int num : beautifulArray((n + 1) / 2)) {
                result[index++] = num * 2 - 1;
            }
            for (int num : beautifulArray(n / 2)) {
                result[index++] = num * 2;
            }
        }
        else result[0]=1;
        map.put(n, result);
        return result;
    }
}
/*
        用map记录已经访问过的 n
        如果有就直接访问 并返回结果
        创建一个结果数组 int[] result =new int[n];
        int index=0;
        if(n!=0){
            遍历beautifulArray(n+1)/2
            result[idnex++]=num*2-1
            遍历 beautifulArray(n/2)
            result[index++]=num*2;
        }
        result[0]=1;
        map.put(n,result);
        return result;

 */