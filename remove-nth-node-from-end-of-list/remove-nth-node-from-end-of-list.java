/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // Calculate the length of the list
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        // Find the position of the node to remove
        int targetIndex = length - n;
        
        // Traverse the list again to remove the node
        current = dummy;
        for(int i = 0; i< targetIndex;i++){
            current = current.next;
            
        }
        current.next = current.next.next;
        return dummy.next;
    }
}