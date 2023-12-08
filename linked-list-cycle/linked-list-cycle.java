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
    ListNode slower = null;
    ListNode faster = null;
    public boolean hasCycle(ListNode head) {
        slower = head;
        faster = head;
    while(faster!=null && faster.next !=null){
        slower = slower.next;
        faster = faster.next.next;
        if(slower==faster){
            return true;
        }
    }
        return false;
        
    }
}