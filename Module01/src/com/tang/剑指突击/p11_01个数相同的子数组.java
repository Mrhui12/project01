package com.tang.剑指突击;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p11_01个数相同的子数组 {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum))
                ans = Math.max(ans, i - map.get(sum));
          else   map.put(sum, i);//包含了就不要再加入了 不然会覆盖最初的答案
        }
        return ans;
    }
}
/*
   一和0相同的子字符串
   把0改成-1
   然后前缀和
   当前缀和相同时 更新 最大值
   用map记录前缀和 和下标
   没有的时候才加入 有了就不要加入 会覆盖最小的
   初始化map put 0 -1;
 */