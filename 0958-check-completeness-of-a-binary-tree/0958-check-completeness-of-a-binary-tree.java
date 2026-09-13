class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean foundNull = false;

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp.left == null) {
                foundNull = true;
            } else {
                if (foundNull) return false;
                q.offer(temp.left);
            }
            if (temp.right == null) {
                foundNull = true;
            } else {
                if (foundNull) return false;
                q.offer(temp.right);
            }
        }
        return true;
    }
}