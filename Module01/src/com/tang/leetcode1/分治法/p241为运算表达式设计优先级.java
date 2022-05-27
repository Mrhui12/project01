package com.tang.leetcode1.分治法;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("all")
/*
            输入：expression = "2-1-1"
            输出：[0,2]
            解释：
            ((2-1)-1) = 0
            (2-(1-1)) = 2
 */
public class p241为运算表达式设计优先级 {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (Integer l : left) {
                    for (Integer r : right) {
                        switch (expression.charAt(i)) {
                            case '*':
                                res.add(l * r);
                                break;
                            case '+':
                                res.add(r + l);
                                break;
                            case '-':
                                res.add(l-r);
                                break;

                        }
                    }
                }

            }
        }
        if (res.isEmpty()) res.add(Integer.parseInt(expression));
        return res;
    }
}
/*
        分治算法
        遇到符号就分开
        递归
        让左结果集合 等于递归的
        让右边的结果集合等于递归的右边
        然后 在遍历左右集合
        根据符号添加结果；
 */