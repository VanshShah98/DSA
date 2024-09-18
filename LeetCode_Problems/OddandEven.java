public class OddandEven {
    public static void main(String[] args) {

    }

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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode temp = odd.next;
        ListNode even = odd.next;
        ListNode c = head;
        int count = 1;
        while (c.next != null) {
            count++;
            c = c.next;
        }
        ListNode prev = null;
        while (odd.next != null) {
            odd.next = temp.next;
            prev = odd;
            odd = temp;
            temp = temp.next;
        }
        if (count % 2 == 0) {
            prev.next = even;
        } else {
            odd.next = even;
        }
        return head;
    }

}
