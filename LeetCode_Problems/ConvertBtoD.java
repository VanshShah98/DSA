/*Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list. */

import java.util.ArrayList;

public class ConvertBtoD {
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

    public static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> ans = new ArrayList<>();
        while (temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }
        System.out.println(ans);
        System.out.println(ans.size());
        return 0;
    }

}
