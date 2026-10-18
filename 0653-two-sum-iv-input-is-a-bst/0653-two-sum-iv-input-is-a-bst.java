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
    Deque <TreeNode> asc = new ArrayDeque<>();
    Deque <TreeNode> desc = new ArrayDeque<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        TreeNode t = root;
        while(t!=null){
            asc.push(t);
            t = t.left;
        }
        t=root;
        while(t!=null){
            desc.push(t);
            t = t.right;
        }

        TreeNode i = getsmall();
        TreeNode j = getbig();
        while(i!=null&&j!=null&&i!=j&&i.val<j.val){
            int sum = j.val + i.val;
            if(sum==k)return true;
            else if(sum<k){
                i=getsmall();
            }else{
                j=getbig();
            }
        }
        return false;
    }
    public TreeNode getsmall(){
        if(asc.isEmpty())return null;
        TreeNode small = asc.pop();
        TreeNode right = small.right;
        while(right!=null){
            asc.push(right);
            right = right.left;
        }
        return small;
    }
    public TreeNode getbig(){
        if(desc.isEmpty())return null;
        TreeNode big = desc.pop();
        TreeNode left = big.left;
        while(left!=null){
            desc.push(left);
            left = left.right;
        }
        return big;
    }
}