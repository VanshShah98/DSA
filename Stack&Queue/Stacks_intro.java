import java.util.*;

//Using In-built Libs.
public class Stacks_intro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(500);
        stack.push(89);
        System.out.println(stack);
        System.err.println("Pop : ");
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(5);
        queue.add(19);
        System.out.println("Queue :" + queue);
        System.out.println("Peek of Queue :  " + queue.peek());
        System.out.println("Removed : " + queue.remove());
        System.out.println(queue.peek());
        queue.offer(15);
        System.out.println("Final : " + queue);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        System.out.println(deque);
        deque.addFirst(78);
        System.out.println(deque);
        deque.addLast(530);
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}
