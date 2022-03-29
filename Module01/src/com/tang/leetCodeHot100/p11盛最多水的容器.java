package com.tang.leetCodeHot100;

public class p11盛最多水的容器 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            max = height[l] > height[r] ?
                    Math.max((r-l)*Math.min(height[l], height[r--]), max) ://注意位置 不要放在放在自增自减运算符后面 不然是改变之后的值
                    Math.max((r-l)*Math.min(height[l++], height[r]) , max);

        }
        return max;
    }
}
/*
思路：
运用双指针，左右指针指向两端 然后判断 短的那端忘内移
同时更新最大值
 */