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
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return false;
        }

        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            // Matlab koi ek hi hai bass null
            return false;
        }

        return isMirror(left.left, right.right) && isMirror(left.right, right.left) &&
        (left.val == right.val);
    }
}