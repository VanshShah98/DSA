package NeetCode.Stack;

import java.util.Stack;

class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minstack;
    
        public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();
        }
    
        public void push(int val) {
            stack.push(val);
            if (minstack.isEmpty() || val <= minstack.peek()) {
                minstack.push(val);
            }
        }
    
        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }
    
        public int top() {
            if (!stack.isEmpty()) {
                return stack.peek();
            }
            return 0;
        }
    
        public int getMin() {
            if (!minstack.isEmpty()) {
                return minstack.peek();
            }
            return -1;
        }
    }
    
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */