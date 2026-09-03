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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return list;
        q.offer(root);
        List<Integer> curr = new ArrayList<>();
        while(!q.isEmpty()){
            int levelSize = q.size();
            while(levelSize>0){
                TreeNode t = q.peek();
                q.poll();
                curr.add(t.val);
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                levelSize--;
            }
            list.add(new ArrayList(curr));
            curr.clear();
        }
        return list;
    }
}