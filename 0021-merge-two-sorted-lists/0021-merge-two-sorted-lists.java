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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode result = new ListNode(0);
        ListNode resultCopy = result;
        
        while(node1 != null && node2 != null){
            // if(node1.val == node2.val){
            //     result.next = node1;
            //     result = result.next;
            //     result.next = node2;
            //     result = result.next;
            //     node1 = node1.next;
            //     node2 = node2.next;
                
           // }else 
            
            if( node1.val <= node2.val){
                result.next = node1;
                result = result.next;
                node1 = node1.next;
            }else{
                result.next = node2;
                result = result.next;
                node2 = node2.next;
                
            }
            
        }
        while(node1 != null){
            result.next = node1;
            node1 = node1.next;
            result = result.next;
        }
        while(node2 != null){
                 result.next = node2;
            node2 = node2.next;
            result = result.next;
        }
        
        return resultCopy.next;
        
    }
}