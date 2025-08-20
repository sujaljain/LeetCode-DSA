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
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }

        return checkLeft(root.left, root.val) && checkRight(root.right, root.val);
    }

    private boolean checkLeft(TreeNode node, int val){
        if (node == null){
            return true;
        }

        return (node.val < val) && checkLeft(node.left, node.val) && checkRight(node.right, node.val);
    }

    private boolean checkRight(TreeNode node, int val){
        if (node == null){
            return true;
        }

        return (node.val > val) && checkRight(node.right, node.val) && checkLeft(node.left, node.val);
    }
}