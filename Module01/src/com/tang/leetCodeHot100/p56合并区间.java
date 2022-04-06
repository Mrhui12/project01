package com.tang.leetCodeHot100;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class p56合并区间 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int L=intervals[i][0],R=intervals[i][1];
            if (ans.isEmpty()||ans.get(ans.size()-1)[1]<L)
                ans.add(new int[] {L,R});
            else ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],R);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
/*
合并区间
先判断数组数量是否为0
将所有数组排序 根据左区间大小
判断结果集合是否为空 或者上一个的区间的右区间小于这个区间的左区间
加入结果集
反正
上个区间的右区间可能会变化 当现在的右区间大于上个的时候
变换右区间

最后将所有的结果转成数组  ans.toArray(new int[ans.size()][])
 */