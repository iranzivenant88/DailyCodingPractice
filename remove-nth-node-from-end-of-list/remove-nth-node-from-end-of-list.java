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
        if(head==null || n <=0 ){
            return null;
        }
        ListNode slow = head;
        ListNode copySlow = slow;
        ListNode faster = head;
        //int a  = n;
        for(int i = 0;i<n;i++){ 
               faster = faster.next;
            }  
        if (faster == null) return head.next;
        while(faster.next != null){
            slow = slow.next;  
            faster = faster.next;
        }
        slow.next = slow.next.next;
        return copySlow;
        
        
    }
}