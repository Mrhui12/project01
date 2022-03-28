package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class 字符串的排列 {
    List<String> res;
    char[] c;

    public String[] permutation(String s) {
        res = new LinkedList<>();
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);//将字符串链表转化为数组
    }

    private void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));//将字符串数据转化为字符串 并且添加在res中
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {//为什么是X，不是0呢
            if (set.contains(c[i])) continue;//同样的字符就剑指 直接跳过
            set.add(c[i]);//加入防止后面重复 因为要用和这个去和其他的交换 这是主要的
            swap(i, x);
            dfs(x + 1);//x相遇于交换的指针 从0到length-1 i相当于被交换的那个值 在一个循环中不变的 但是要保证唯一 不然就重复了
            swap(i, x); //回溯的时候恢复
        }
    }

    private void swap(int i, int x) {
        int tmep = i;
        c[i] = c[x];
        c[x] = c[tmep];
    }
}
