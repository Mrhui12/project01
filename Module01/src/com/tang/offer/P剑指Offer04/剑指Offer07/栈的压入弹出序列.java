package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.Stack;

public class 栈的压入弹出序列
{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0;

        for (int num : pushed) {
            stack.push(num);

            while (!stack.isEmpty()&&stack.peek()==popped[i]){
                i++;
                stack.pop();
            }
        }
        return  stack.isEmpty();

    }
}
