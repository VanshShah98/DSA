

class ReorderList {
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
        ReorderList obj = new ReorderList();

        // Create input linked list
        int[] values = { 1, 2, 3, 4, 5 }; // Example input
        ListNode head = obj.createLinkedList(values);

        System.out.println("Original List:");
        obj.printLinkedList(head);

        // Reorder the list
        obj.reorderList(head);

        System.out.println("Reordered List:");
        obj.printLinkedList(head);
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode secondHalf = reverseLinkedList(mid.next);
        mid.next=null;
        ListNode firstHalf = head;
        while (secondHalf != null) {
            ListNode temp1=firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next=secondHalf;
            secondHalf.next=temp1;
            firstHalf=temp1;
            secondHalf=temp2;
        }
        System.out.println(head);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
