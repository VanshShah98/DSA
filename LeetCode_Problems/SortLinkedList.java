import java.util.ArrayList;
import java.util.Collections;

public class SortLinkedList {
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

    public static void main(String[] args) {

    }

    public ListNode sortListBruteForce(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ListNode curr = head;
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(ans);
        return arraytolinkedlist(ans);
    }

    public static ListNode arraytolinkedlist(ArrayList<Integer> ans) {
        if (ans.isEmpty() || ans.size() == 0) {
            return null;
        }
        ListNode head = new ListNode(ans.get(0));
        ListNode curr = head;
        for (int i = 1; i < ans.size(); i++) {
            ListNode newNode = new ListNode();
            newNode.val = ans.get(i);
            curr.next = newNode;
            curr = newNode;
        }
        return head;
    }

    // Optimized
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode leftPart = sortList(head);
        ListNode rightPart = sortList(mid);
        return mergeLists(leftPart, rightPart);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    private ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 != null ? l1 : l2;// when the lists are unequal
        return dummy.next;
    }

}
