/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> stack = new Stack<>();
        ListNode copy = head;

        while (copy != null){
            stack.push(copy);
            copy = copy.next;
        }

        ListNode newRoot = stack.pop();
        copy = newRoot;
        
        while (!stack.isEmpty()){
            copy.next = stack.pop();
            copy = copy.next;
        }

        copy.next = null;
        return newRoot;
    }
}