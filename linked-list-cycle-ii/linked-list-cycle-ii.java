/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while(l2 != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next.next;
            if(l1 == l2){
                l2 = head;
                
                while(l1 != l2){
                l1 = l1.next;
                l2 = l2.next;
                    
                }
                return l2;
            }
           
            }
         return null;
        }
       
}