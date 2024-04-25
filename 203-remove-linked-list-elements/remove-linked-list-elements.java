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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode result = prev;
        ListNode current = head;
        
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
                current = prev.next;
            }else{
                prev = current ;
                current = current.next;
            }
        }
        return result.next;
        
    }
}