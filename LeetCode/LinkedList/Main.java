
// Leetcode 83 Remove duplicates Node from LinkedList

import java.util.*;
import java.io.*;

class Solution {
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-(int) 1e8);
        ListNode itr = dummy, curr = head;

        while (curr != null) {
            while (curr != null && itr.val == curr.val)
                curr = curr.next;

            itr.next = curr;
            itr = itr.next;
            if (curr != null) {
                curr = curr.next;
            }

        }

        return dummy.next;
    }
}