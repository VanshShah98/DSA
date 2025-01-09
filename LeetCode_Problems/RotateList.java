public class RotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        int length = 1; 
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }


        curr.next = head;

        
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

       
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

}
