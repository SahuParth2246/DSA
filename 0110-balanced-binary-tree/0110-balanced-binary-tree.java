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
        if(root==null)return true;
        solve(root);
        return flag;
    }
    boolean flag = true;
    public int solve(TreeNode node){
        if(node==null)return 1;
        int left = 1+ solve(node.left);
        int right =1+solve(node.right);
        int height = (int)Math.abs(left-right);
        if(height>1)flag = false;
        return Math.max(left,right);
    }
}