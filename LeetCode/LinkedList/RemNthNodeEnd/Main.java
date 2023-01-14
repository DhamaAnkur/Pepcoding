
 // Leetcode (19) Remove Nth Node from LinkedList
 // Link of Question( https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/ ) 
 public class Main{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<n ; i++){
            fast = fast.next;
        }

        if(fast == null) return slow.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}