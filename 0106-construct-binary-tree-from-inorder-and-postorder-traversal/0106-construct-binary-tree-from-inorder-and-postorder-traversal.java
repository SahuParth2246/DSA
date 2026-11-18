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
    HashMap <Integer,Integer> map = new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(postorder,0,inorder.length-1);
    }
    public TreeNode fun(int [] postorder,int low ,int high){
        if(low>high)return null;
        TreeNode node = new TreeNode(postorder[index]);
        index--;
        int id = map.get(node.val);
        node.right = fun(postorder,id+1,high);
        node.left= fun(postorder,low,id-1);
        return node;
    }
    
}