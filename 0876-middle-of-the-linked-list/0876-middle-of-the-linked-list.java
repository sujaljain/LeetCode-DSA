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
    public ListNode middleNode(ListNode head) {
        int length = findLength(head);
        ListNode copy = head;

        int i = 0;
        while (i < length/2){
            i++;
            copy = copy.next;
        }

        return copy;
    }

    public int findLength(ListNode head){
        if (head == null) return 0;

        int length = 0;
        ListNode copy = head;
        while (copy != null){
            length++;
            copy = copy.next;
        }

        return length;
    }
}