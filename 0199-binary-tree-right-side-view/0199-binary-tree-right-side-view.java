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
    public List<Integer> rightSideView(TreeNode root) {
        //agar same level pe right exist karta hai to left nahi hoga 
        // root node to hogi hi 
        List <Integer> list = new ArrayList<>();
        if(root == null)return list;
        Deque <TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        TreeNode last = null;
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                TreeNode t = q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                size--;
                last = t;
            }
            list.add(last.val);

        }
        return list;
    }
}