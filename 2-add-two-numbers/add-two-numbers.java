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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        1. pointer1 for l1
        2. pointer2 for l2
        3. create ListNode result
        4. initialize carry = 0
        5. for every node in pointer1 + everynode in pointer2
                sum = pointer1.val + pointer2.val
                if sume exceeds 9. 
                    apped the the last digit of the sum to the result
                    update the carry with the first digit of the sum
                
                advance pointer1
                advance pointer2
       
        */
       ListNode p1 = l1; 
       ListNode p2 = l2;
       ListNode dummyHead = new ListNode(0);
       ListNode current = dummyHead;
       int carry = 0; 
      while(p1 != null && p2 != null) {
          int sum = p1.val + p2.val; //7
          sum += carry; //8
          if (sum > 9) {
              int rem = sum % 10; // 10
              current.next = new ListNode(rem);
              current = current.next;   
          } else{
              current.next = new ListNode(sum);
              current = current.next;  
          }
          carry = sum / 10;   // 0
          p1 = p1.next;
          p2 = p2.next;
      }
      
      while(p1 != null) {
          // p2 == null
          int total = p1.val + carry;
          int rem = total % 10;
          current.next = new ListNode(rem);
          current = current.next; 
          carry = total / 10; 
          p1 = p1.next;
      }
        
     while(p2 != null) {
          // p1 == null
          int total = p2.val + carry;
          int rem = total % 10; 
          current.next = new ListNode(rem);
          current = current.next; 
          carry = total / 10; 
          p2 = p2.next;
      }
        
      if(carry != 0) {
         current.next = new ListNode(carry);
          
      }
       return dummyHead.next; 
    }
}