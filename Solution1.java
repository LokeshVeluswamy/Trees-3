// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 
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
    boolean isvalid;
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        isvalid = true;
        helper(root.left, root.right);
        return isvalid;
    }
    private void helper(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) return;
        if(left == null || right == null || left.val != right.val)
        {
            isvalid = false;
            return;
        }
        helper(left.left, right.right);
        helper(left.right, right.left);
    }
}