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
    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null) {
        return true; 
      }

      // find the middle
      ListNode slow = head;
      ListNode fast = head; 
      
      while(fast.next != null && fast.next.next != null) {
        //fast.next != null && fast.next.next != null
          slow = slow.next;
          fast = fast.next.next;
      }
      // slow is the middle
      // fast is the head of the second half
      
      // reverse the first half of the list
      ListNode reversedHead = reverse(slow.next); 
      
      // compare the first half and second half 
      ListNode copyHead = head; 
      
      while(reversedHead != null) {
          if(copyHead.val != reversedHead.val) {
            return false; 
          } else{
            copyHead = copyHead.next; 
            reversedHead = reversedHead.next;
          }
      }
      return true;  
    }
  
    private ListNode reverse( ListNode head) {
      ListNode prev = null; 
      ListNode curr = head; 
      while(curr != null) {
        ListNode temp = curr.next; 
        curr.next = prev;
        prev = curr; 
        curr = temp; 
      }
      return prev; 
    }
  
}