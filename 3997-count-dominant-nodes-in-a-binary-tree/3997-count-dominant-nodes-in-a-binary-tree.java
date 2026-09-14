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
    public int countDominantNodes(TreeNode root) {
        max(root);
        return count;
    }
    int count = 0;

    public int max (TreeNode root){
        if(root==null){
            return 0;
        }
        int left = max(root.left);
        int right = max(root.right);
        if (root.val >= left && root.val >= right) count++;
        return Math.max(root.val,Math.max(left,right));

    }
}