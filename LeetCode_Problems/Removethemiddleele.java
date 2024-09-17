public class Removethemiddleele {
    public class ListNode {
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

    public static void main(String[] args) {

    }

    // Approch 1
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null || head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Approch 2
    public ListNode deleteMiddle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (slow.next == null) {
            deleteLastNode(slow, head);
        } else {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }
        return head;
    }

    public ListNode deleteLastNode(ListNode lastNode, ListNode head) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        ListNode current = head;
        while (current.next != lastNode) {
            current = current.next;
        }
        current.next = null;
        return lastNode;
    }

}
