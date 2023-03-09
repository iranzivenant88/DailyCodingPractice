public class ReverseLinkedList {

     // Definition for singly-linked list.
      public class ListNode {
         int val;

        ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
      }

        public ListNode reverseList(ListNode head) {
            ListNode  prev = null;
            ListNode current = head;
            while(current!=null){
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            return prev;
        }
    }

