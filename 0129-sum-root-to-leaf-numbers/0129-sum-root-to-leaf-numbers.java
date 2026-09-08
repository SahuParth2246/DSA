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
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        int sum = 0;
        List <Integer> list = new ArrayList<>();
        solve(root,"",list);
        for(int num:list){
            sum+=num;
        }
        return sum;
    }
    public void solve(TreeNode root, String s, List<Integer> list) {
        if(root == null) return;
        s = s + root.val; 
        if(root.left == null && root.right == null) {
            list.add(Integer.parseInt(s));
            return;
        }
        solve(root.left, s, list);
        solve(root.right, s, list);
    }
}