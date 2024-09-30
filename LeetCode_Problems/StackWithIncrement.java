/*
Design a stack that supports increment operations on its elements.

Implement the CustomStack class:

CustomStack(int maxSize) :Initializes the object with maxSize which is the maximum number of elements in the stack.
void push(int x) :Adds x to the top of the stack if the stack has not reached the maxSize.
int pop() : Pops and returns the top of the stack or -1 if the stack is empty.
void inc(int k, int val) : Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, increment all the elements in the stack.
 */

public class StackWithIncrement {
    class CustomStack {
        int[] stack;
        int ptr = -1;

        public CustomStack(int maxSize) {
            this.stack = new int[maxSize];
        }

        public void push(int x) {
            if (ptr < this.stack.length - 1) {
                ptr++;
                this.stack[ptr] = x;
            }
        }

        public int pop() {
            if (ptr != -1) {
                return this.stack[ptr--];
            }
            return -1;
        }

        public void increment(int k, int val) {
            for (int i = 0; i < Math.min(k, ptr + 1); i++) {
                this.stack[i] += val;
            }
        }
    }

    /**
     * Your CustomStack object will be instantiated and called as such:
     * CustomStack obj = new CustomStack(maxSize);
     * obj.push(x);
     * int param_2 = obj.pop();
     * obj.increment(k,val);
     */
}
