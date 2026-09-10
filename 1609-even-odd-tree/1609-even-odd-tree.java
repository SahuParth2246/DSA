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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)return false;
        Deque<TreeNode> q= new ArrayDeque<>();
        if(root.val%2==0)return false;
        int count = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int prev = (count % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while(size>0){
                TreeNode temp = q.poll();
                int level = count%2;
                if(level!=0){
                    if(temp.val%2!=0)return false;
                }else{
                    if(temp.val%2==0)return false;
                }
                if (count % 2 == 0 && temp.val <= prev) return false;
                if (count % 2 != 0 && temp.val >= prev) return false;
                prev = temp.val;
                if(temp.left!=null)q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
                size--;
            }
            count++;
        }
        return true;
    }
}