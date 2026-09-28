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
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,k);
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    public boolean solve(TreeNode root,int k){
        if(root==null)return false ;
        int seen = k-root.val;
        if(map.containsKey(seen))return true;
        else map.put(root.val,map.getOrDefault(root.val,0)+1);
        boolean left = solve(root.left,k);
        boolean right = solve(root.right,k);
        return left||right;
    }
}