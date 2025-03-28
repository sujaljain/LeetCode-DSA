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
    // Post Order Traversal
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list.get(k-1);
    }

    public void inorder(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}