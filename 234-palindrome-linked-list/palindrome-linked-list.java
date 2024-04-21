class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; 
        }

        // Find the middle
        ListNode slow = head;
        ListNode fast = head; 

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is the middle or middle-left

        // Reverse the second half of the list
        ListNode reversedHead = reverse(slow.next); 

        // compare the first half and second half 
        ListNode firstHalf = head; 
        ListNode secondHalf = reversedHead; 

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false; 
            }
            firstHalf = firstHalf.next; 
            secondHalf = secondHalf.next; 
        }
        return true;  
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null; 
        ListNode curr = head; 
        while (curr != null) {
            ListNode temp = curr.next; 
            curr.next = prev;
            prev = curr; 
            curr = temp; 
        }
        return prev; 
    }
}
