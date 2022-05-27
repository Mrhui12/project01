package com.tang.leetcode1.妙用数据结构;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p149直线上最多的点数 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int same = 1, max = 0, same_y = 1;
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (points[i][1] == points[j][1]) {
                    same_y++;
                    if (points[i][0] == points[j][0])
                        same++;
                } else {
                    double dx = points[i][0] - points[j][0];
                    double dy = points[i][1] - points[j][1];
                    double abs = dx / dy;
                    map.put(abs, map.getOrDefault(abs, 0) + 1);
                }
            }
            max = Math.max(same_y, max);
            for (Double index : map.keySet()) {
                max = Math.max(max, map.get(index) + same);
            }
            map.clear();

        }
        return max;
    }
}
/*
先判断 长度是否小鱼儿 小鱼儿 直接返回n
再设置一个 max=0 same=1 same_y=1
遍历  for(i=1;i<n;i++){
same=1 same_y=1;
 遍历 for（j=i+1;j<n;j++){
 if( y相同){
 same_y++;
  if(x也相同）
  same++
  } else{
  int a=xcha
  int y=ycah
  double a/y
if(=-0) =0;
  }
  max=max y
  max 遍历hash
  max=max hash +same;
  hash.clear();
 }
 }
 */