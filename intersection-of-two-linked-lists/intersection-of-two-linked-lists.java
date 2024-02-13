/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB;
        while( first != second){
            if(first != null){
                first = first.next;
            }else{
                first = headB;
            }
           if(second == null){
               second = headA;
           }else{
               second = second.next;
           }
        }
        if( first == second){
            return first;
        }
        return null;
    }
}