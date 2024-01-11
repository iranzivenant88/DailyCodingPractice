/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        helper(head);
        return head;
    }
    
    public Node helper(Node current){
        Node tailKeeper = null;
        while(current != null){
            tailKeeper = current;
            if(current.child != null){
                //call helper method ()
                Node tail = helper(current.child);
                //manippulate pointers(changes pointers)
                tail.next = current.next;
                if(current.next != null){
                    current.next.prev = tail;
                }
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
                current = tail.next;
                tailKeeper = tail;
            }else{
                current = current.next;
            }
        }
        return tailKeeper;
    }
}
