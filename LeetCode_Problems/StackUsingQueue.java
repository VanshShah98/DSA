import java.util.*;

public class StackUsingQueue {

    class MyStack {
        private Queue<Integer> first;
        private Queue<Integer> second;

        public MyStack() {
            first = new LinkedList<>();
            second = new LinkedList<>();
        }

        public void push(int x) {
            first.add(x);
        }

        public int pop() {
            int removed = 0;
            while (!first.isEmpty()) {
                removed = first.remove();
                second.add(removed);
            }
            while (!second.isEmpty()) {
                first.add(second.remove());
            }
            return removed;
        }

        public int top() {
            int peeked = 1;
            while (!first.isEmpty()) {
                peeked = first.remove();
                second.add(peeked);
            }
            while (!second.isEmpty()) {
                first.add(second.remove());
            }
            return peeked;
        }

        public boolean empty() {
            if (first.peek() == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
