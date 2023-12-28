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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next ==null){
            return false;
        }
        ListNode faster = head.next;
        ListNode slow = head;
        while(faster != null && faster.next != null){
            faster = faster.next.next;
            slow = slow.next;
            if(faster == slow){
                return true;
            }
        }
        return false;
    }
}