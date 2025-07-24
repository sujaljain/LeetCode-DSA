/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int lHeight = calculateHeight(root.left);
        int rHeight = calculateHeight(root.right);

        if (Math.abs(lHeight - rHeight) > 1)
            return false;

        // Also check left and right subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int calculateHeight(TreeNode node) {
        if (node == null)
            return 0;

        int left = calculateHeight(node.left);
        int right = calculateHeight(node.right);

        return Math.max(left, right) + 1;
    }
}