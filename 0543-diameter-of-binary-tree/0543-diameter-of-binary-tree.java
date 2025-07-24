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
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxDiameter;
    }

    public int calculateHeight(TreeNode root) {
        if (root == null)
            return 0;

        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);

        // Update the max diameter found so far
        maxDiameter = Math.max(maxDiameter, left+right);

        // Return height of current node
        int height = Math.max(left, right) + 1;

        return height;
    }
}