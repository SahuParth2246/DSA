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
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<Double> list = new ArrayList<>();
        if(root==null)return list;
        q.offer(root);
        double sum = 0;
        int size = 0;
        List<Integer> curr = new ArrayList<>();
        while(!q.isEmpty()){
            int levelSize = q.size();
            size = levelSize;
            while(levelSize>0){
                TreeNode t = q.poll();
                sum+=t.val;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                levelSize--;
            }
            sum=sum/size;
            list.add(sum);
            sum=0;
        }
        return list;
    }
}