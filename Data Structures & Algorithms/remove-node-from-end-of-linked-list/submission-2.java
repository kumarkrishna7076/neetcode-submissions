class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        if (head == null)
            return null;

        ListNode curr = head;    
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        
        int position = length-n+1;
        if(position == 1)
           return head.next;

        curr = head;
        for(int i=1;i<position-1;i++){
            curr = curr.next;
        }   

        curr.next=curr.next.next;

        return head;   
    }
}
