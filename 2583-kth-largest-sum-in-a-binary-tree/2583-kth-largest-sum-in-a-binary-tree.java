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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null)return 0;
        Deque <TreeNode> q = new ArrayDeque<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            while(size>0){
                TreeNode t = q.poll();
                sum+=t.val;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                size--;
            }
            heap.add(sum);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return heap.size()<k?-1:heap.poll();
    }
}