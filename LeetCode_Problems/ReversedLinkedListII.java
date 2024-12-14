public class ReversedLinkedListII {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static void main(String[] args) {
        
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev=null;
        for(int i=0;curr!=null && i<left-1;i++){
            prev = curr;
            curr=curr.next;
        }
        ListNode last = prev;
        ListNode newEnd= curr;
        ListNode next = curr.next;
        for(int i=0;curr != null && i< right-left +1;i++){
            curr.next =prev;
            prev = curr;
            curr = next;
            if(next != null){
                next=next.next;
            }
        }
        if(last != null){
            last.next=prev;
        }
        else{
            head=prev;
        }
        newEnd.next=curr;
        return head;
    }
}