public class LinkedListCycle {
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
        public boolean hasCycle(ReverseLinkedList.ListNode head) {
            if(head==null){
                return false;
            }
            ReverseLinkedList.ListNode slow = head;
            ReverseLinkedList.ListNode fast = head.next;
            while(slow!=fast){
                if(fast==null || fast.next ==null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;

        }

}
