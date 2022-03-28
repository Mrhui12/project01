package leetcode.Structure.StacksList;

import java.util.Stack;

public class Demo232_使用堆栈实现队列 {
    class MyQueue {
        private Stack<Integer> a;
        private Stack<Integer> b;

        public MyQueue(Stack<Integer> a, Stack<Integer> b) {
            this.a = new Stack<>();
            this.b = new Stack<>();
        }

        public void push(int x) {
            a.push(x);
        }

        public int pop() {
            if (b.isEmpty()) while (!a.isEmpty()) {
                b.push(a.pop());
            }
            return b.pop();
        }

        public int peek() {
            if (b.isEmpty()) while (!a.isEmpty()) {
                b.push(a.pop());
            }
            return b.peek();
        }

        public boolean empty() {
            return a.isEmpty() && b.isEmpty();
        }
    }
}
