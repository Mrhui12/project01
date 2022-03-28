package leetcode.Structure.StacksList;

import java.util.Deque;
import java.util.Stack;

public class Demo155最小栈 {
    class MinStack {
        private Stack<Integer> data;
        private Stack<Integer> help;

        public MinStack() {
            data = new Stack<>();
            help = new Stack<>();
        }

        public void push(int val) {
            data.push(val);
            if (help.isEmpty() || help.peek() >= val)
                help.push(val);
        }

        public void pop() {
            if (!help.isEmpty() && help.peek() == data.peek()) {
                help.pop();
            }
            data.pop();
        }

        public int top() {
            return data.peek();
        }

        public int getMin() {
            return help.peek();
        }
    }
}
