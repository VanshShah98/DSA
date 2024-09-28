
/*
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

    Implement the MyQueue class:

    void push(int x) Pushes element x to the back of the queue.
    int pop() Removes the element from the front of the queue and returns it.
    int peek() Returns the element at the front of the queue.
    boolean empty() Returns true if the queue is empty, false otherwise.
 */
import java.util.*;

public class QueueUsingStack {

    class MyStack {
        private Queue<Integer> first;

        public MyStack() {
            first = new LinkedList<>();
        }

        public void push(int x) {
            first.offer(x);
            for (int i = 0; i < first.size() - 1; i++) {// this for loop rotated teh queue.
                first.offer(first.poll());
            }
        }

        public int pop() {
            return first.poll();
        }

        public int top() {
            return first.peek();
        }

        public boolean empty() {
            return first.isEmpty();
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
