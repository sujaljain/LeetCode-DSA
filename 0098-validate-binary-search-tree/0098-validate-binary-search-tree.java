// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int val) { this.val = val; }
// }

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        if (node == null) {
            return true; // An empty node is a valid BST
        }
        
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
