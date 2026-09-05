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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return solve(p,q);
    }
    public boolean solve(TreeNode a, TreeNode p){
        if(a==null&&p==null)return true;
        if(!(p!=null&&a!=null&&a.val==p.val))return false;
        boolean left = solve(a.left,p.left);
        boolean right = solve(a.right,p.right);
        return (left&&right);
    }
}