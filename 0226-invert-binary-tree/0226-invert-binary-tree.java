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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        solve(root);
        return root;
    }
    public void solve(TreeNode t){
        if(t==null)return;
        if(t.right==null&&t.left==null)return;
        TreeNode temp = t.right;
        t.right = t.left;
        t.left = temp;
        solve(t.left);
        solve(t.right);
        return;
    }
}