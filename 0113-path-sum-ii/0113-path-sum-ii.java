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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return list;
        List<Integer> curr = new ArrayList<>();
        solve(root,0,targetSum,curr,list);
        return list;
    }
    public void solve(TreeNode root ,int sum , int tsum, List<Integer> curr , List<List<Integer>> list){
        if(root==null)return;
        sum+=root.val;
        curr.add(root.val);
        if(sum==tsum&&root.left==null&&root.right==null){
            list.add(new ArrayList(curr));
        }
        solve(root.left,sum,tsum,curr,list);
        solve(root.right,sum,tsum,curr,list);
        curr.remove(curr.size()-1);
    }
}