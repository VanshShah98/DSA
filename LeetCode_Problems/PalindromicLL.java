import java.util.LinkedList;

public class PalindromicLL {
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
        //Bug Fix
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond= reverseList(mid);
        while (head != null && headsecond != null) {
            if(head.val != headsecond.val){
                return false;
            }
            head=head.next;
            headsecond=headsecond.next;
            
        }
        return head==null || headsecond==null;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next; 
            current.next = prev;
            prev = current; 
            current = nextTemp;
        }
        
        return prev;
    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
