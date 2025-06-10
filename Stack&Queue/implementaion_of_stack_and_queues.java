
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class implementaion_of_stack_and_queues {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(95);
        stack.push(50);
        System.out.println("Stack : " + stack);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(53);
        queue.add(95);
        queue.add(15968);
        queue.add(123654);
        System.out.println("Queue : " + queue);
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque);

    }
}
