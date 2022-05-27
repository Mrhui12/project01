package com.tang.leetcode1.妙用数据结构;

import java.util.Stack;

@SuppressWarnings("all")
public class p739每日温度 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < temperatures.length; i++) {
           while (!s.isEmpty()){
               int index=s.peek();
               if (temperatures[index]>=temperatures[i])
                   break;
               s.pop();
               ans[index]=i-index;
           }
           s.push(i);
        }
        return ans;
    }
}
