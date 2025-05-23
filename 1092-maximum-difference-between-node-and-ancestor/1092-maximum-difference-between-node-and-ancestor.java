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
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int currMin, int currMax){
        // Base Case
        if (node == null){
            return currMax - currMin;
        }

        currMin = Math.min(currMin, node.val);
        currMax = Math.max(currMax, node.val);

        int left = dfs(node.left, currMin, currMax);
        int right = dfs(node.right, currMin, currMax);

        return Math.max(left, right);
    }
}