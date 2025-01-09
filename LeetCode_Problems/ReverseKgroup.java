public class ReverseKgroup {
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public static void main(String[] args) {
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        ListNode curr = head;
        ListNode prev=null;
        while (true) {
            ListNode checker = curr;
            int count = 0;
            while (checker != null && count < k) {
                checker = checker.next;
                count++;
            }
    
            if (count < k) { 
                break;
            }
            ListNode last = prev;
            ListNode newEnd= curr;
            ListNode next = curr.next;
            for(int i=0;curr != null && i< k;i++){
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
            if(curr==null){
                break;
            }
            prev=newEnd;
        }   
        return head;

    }
}
