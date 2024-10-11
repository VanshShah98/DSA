import java.util.Stack;

class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();

    }

    public void push(int val) {
        int a = stack.push(val);
        System.out.println("Stack after push :" + a);
        System.out.println(stack);
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int a = stack.pop();
        System.out.println("Stack pop " + a);
        System.out.println(stack);
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return 0;
    }

    public int getMin() {
        // System.out.println(stack);
        int min = 0;
        if (!stack.isEmpty()) {
            min = stack.pop();
        }
        // System.out.println(min);
        while (!stack.isEmpty()) {
            int poped = stack.pop();
            System.out.println("Stack pop " + poped);
            if (poped < min) {
                min = poped;
            }
        }
        return min;
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