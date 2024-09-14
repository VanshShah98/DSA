import java.util.*;

public class MeargeLinkedList {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (l1 != null) {
            result.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            result.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(result);
        return arrayListToLinkedList(result);
    }

    public static ListNode arrayListToLinkedList(ArrayList<Integer> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(arrayList.get(0));
        ListNode current = head;

        for (int i = 1; i < arrayList.size(); i++) {
            ListNode newNode = new ListNode(arrayList.get(i));
            current.next = newNode;
            current = newNode;
        }

        return head;
    }
}
