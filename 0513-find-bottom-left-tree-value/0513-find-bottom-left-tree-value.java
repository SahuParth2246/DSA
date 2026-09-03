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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)return 0;
        Deque <TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        TreeNode ans = null;
        while(!q.isEmpty()){
            int size = q.size();
            ans = q.peek();
            while(size>0){
                TreeNode t = q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                size--;
            }
        }
        return ans.val;
    }
}