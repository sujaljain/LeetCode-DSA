/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode copy = root;

        while (copy != null){
            if (p.val < copy.val && q.val < copy.val)
                copy = copy.left;
            else if (p.val > copy.val && q.val > copy.val)
                copy = copy.right;
            else
                return copy;
        }

        return null;
    }
}