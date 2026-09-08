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
    public int pathSum(TreeNode root, int targetSum) {
        solve(root,targetSum);
        return count;
    }
    int count = 0;
    public void solve(TreeNode root , int tsum ){
        if(root==null)return ;
        count+=ct(root,tsum,0);
        solve(root.left , tsum);
        solve(root.right ,tsum);

    }
    public int ct(TreeNode root,int tsum,long sum){
        if(root==null)return 0;
        int count = 0;
        sum+=root.val;
        if(sum==tsum)count = 1;;
        int left = ct(root.left,tsum,sum);
        int right = ct (root.right,tsum,sum);
        return count + left + right;
    }
}