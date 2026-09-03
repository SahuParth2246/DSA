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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        boolean flag = false;
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return list;
        q.offer(root);
        List<Integer> curr = new ArrayList<>();
        while(!q.isEmpty()){
            int levelSize = q.size();
            while(levelSize>0){
                TreeNode t = q.poll();
                curr.add(t.val);
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                levelSize--;
            }
            if(flag)Collections.reverse(curr);
            list.add(new ArrayList(curr));
            curr.clear();
            flag = !flag;
        }
        return list;
    }
}