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
        if (head == null || head.next == null) return true;

        // Step 1: Let's find the middle node
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverseList(slow);

        // Step 3: Comparing the two halves
        ListNode firstHalf = head;
        ListNode copySecondHalf = secondHalf; // To restore later

        while (secondHalf != null){
            if (firstHalf.val != secondHalf.val)    return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        } 

        // Step 4 (Optional) : Restore the reversed half back
        reverseList(copySecondHalf);

        return true;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev; // New Head of the reversed list
    }
}