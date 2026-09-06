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
        solve(root,p,q);
        return x;
    }
    TreeNode x = null;
    public boolean solve(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return false;
        boolean left = solve(root.left, p, q);
        boolean right = solve(root.right, p, q);
        boolean curr = (root==p || root==q);
        if(left && right) x = root;
        if(curr && (left || right)) x = root;
        return (left || right || curr);
    }
}