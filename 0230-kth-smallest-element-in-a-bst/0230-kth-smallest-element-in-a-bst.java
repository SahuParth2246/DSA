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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                TreeNode temp = q.poll();
                heap.add(temp.val);
                while(heap.size()>k){
                    heap.poll();
                }
                if(temp.left!=null)q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
                size--;
            }
        }
        return heap.poll();
    }
}