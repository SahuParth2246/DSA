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
    HashMap<Integer,Integer> map = new HashMap<>();
    int max =0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)return new int[]{0};
        solve(root);
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
        int ans [] = new int[list.size()];
        int index =0;
        for(int num:list){
            ans[index]=num;
            index++;
        }
        return ans;
        
    }
    public int solve(TreeNode root){
        if(root==null)return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        int sum = left+right+root.val;

        map.put(sum,map.getOrDefault(sum,0)+1);
        max=Math.max(max,map.get(sum));
        return sum;
    }
}