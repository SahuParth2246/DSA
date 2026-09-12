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
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        Deque <TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int count = 0;
        int level = 0;
        long max = Long.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            while(size>0){
                TreeNode temp = q.poll();
                sum+=temp.val;
                if(temp.left!=null)q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
                size--;
            }
            count++;
            if(sum>max){
                max=sum;
                level=count;
            }
        }
        return level;

    }
    
}