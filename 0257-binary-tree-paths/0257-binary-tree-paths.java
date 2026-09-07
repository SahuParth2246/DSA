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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)return list;
        solve(root,"");
        return list;
    }
    List<String> list = new ArrayList<>();
    public void solve(TreeNode root, String path) {
        if(root == null) return;
        path += root.val;
        if(root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        solve(root.left, path + "->");
        solve(root.right, path + "->");
    }
}