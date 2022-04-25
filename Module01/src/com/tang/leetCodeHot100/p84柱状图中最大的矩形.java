package com.tang.leetCodeHot100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class p84柱状图中最大的矩形 {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> sta = new Stack<>();
        int n = heights.length, res = 0;
        if (n == 0) return 0;
        if (n == 1) return heights[0];
        for (int i = 0; i < n; i++) {
            while (!sta.isEmpty() && heights[sta.peek()] > heights[i]) {
                int curheight = heights[sta.pop()];
                while (!sta.isEmpty() && curheight == heights[sta.peek()])
                    sta.pop();
                int width = 0;
                if (sta.isEmpty()) width = i;
                else width = i - sta.peek() - 1;
                res = Math.max(res, width * curheight);
            }
            sta.push(i);
 
        }
        while (!sta.isEmpty()) {
            int curheight = heights[sta.pop()];
            while (!sta.isEmpty() && heights[sta.peek()] == curheight)
                sta.pop();
            int width = 0;
            if (sta.isEmpty())
                width = n;
            else width = n - sta.peek() - 1;
            res = Math.max(res, width * curheight);
        }
        return res;
    }
}
/*
单调栈
如果长度为0 返回0
如果唯一 返回当前高度
遍历 不为空就 比较当前栈顶和下一个值大小
如果大于下一个值
就出栈
记高度
如下栈顶和当前的高度一样 继续出栈
宽度 当栈为空 宽度为i
反之为 i-栈顶元素-1
更新res

 当前i入栈

 遍历完 如果栈不为空
 出栈 记高度
 栈顶和当前一样 继续出栈
 记宽度 如果栈为空 宽度为数组长度
 反正 宽度为 数组长度-当前栈顶元素-1；
 更新res

 返回res;
 */

