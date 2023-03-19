public class DeletenNodeInLinkedlist {
    public ReverseLinkedList.ListNode node;
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;

     *     ListNode(int x) { val = x; }
     * }
     */

        public void deleteNode(ReverseLinkedList.ListNode node) {
            node.val= node.next.val;
            node.next = node.next.next;

        }

}
