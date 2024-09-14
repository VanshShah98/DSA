import java.util.ArrayList;

public class RemoveNthelefromback {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Brute Force
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode pointer = head;
        while (pointer != null) {
            result.add(pointer.val);
            pointer = pointer.next;
        }
        result.remove(result.size() - n);
        return arraytoLinkedList(result);
    }

    public static ListNode arraytoLinkedList(ArrayList<Integer> result) {
        if (result.size() == 0 || result.isEmpty()) {
            return null;
        }
        ListNode ans = new ListNode(result.get(0));
        ListNode current = ans;
        for (int i = 1; i < result.size(); i++) {
            ListNode newNode = new ListNode(result.get(i));
            current.next = newNode;
            current = newNode;
        }
        return ans;
    }

    // Optimized
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow = slow.next.next;
        return head;
    }
}
