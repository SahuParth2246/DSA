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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return solve(root,targetSum,0,false);
    }
    public boolean solve (TreeNode root , int tsum, int sum , boolean x){
        if(root==null)return false;
        sum+=root.val;
        if(sum==tsum&&root.right==null&&root.left==null)return true;
        boolean left = solve(root.left,tsum,sum,x);
        boolean right = solve(root.right,tsum,sum,x);
        return (left||right);
    }
}