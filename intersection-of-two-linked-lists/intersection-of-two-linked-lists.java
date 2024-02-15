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
        ListNode one = headA;
        ListNode two = headB;
        
        while( one != two ){
          if(one ==null){
              one = headB;
        }else {
            one = one.next;
        }
        
        if(two == null){
            two = headA;
        }else{
            two = two.next;
        }
        }
         if( one == two){
            return one;
        }else{
            return null;
        }
        
    }
}