/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Deque <Node> q =  new ArrayDeque<>();
        if(root==null)return null;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node x = q.poll();
            if(x.left!=null)q.offer(x.left);
            if(x.right!=null)q.offer(x.right);
            size--;
            while(size>0){
                Node t = q.poll();
                x.next = t;
                x=x.next;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                size--;
            }
            x.next = null;
        }
        return root;
    }
}