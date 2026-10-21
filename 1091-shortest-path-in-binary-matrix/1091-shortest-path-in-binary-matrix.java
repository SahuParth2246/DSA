class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;

        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        grid[0][0] = 1;                       

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        int len = 1;

        while (!q.isEmpty()) {
            int size = q.size();            
            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                if (cur[0] == n - 1 && cur[1] == n - 1) return len;

                for (int[] d : dirs) {
                    int r = cur[0] + d[0], c = cur[1] + d[1];
                    if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != 0) continue;
                    grid[r][c] = 1;       
                    q.offer(new int[]{r, c});
                }
            }
            len++;
        }
        return -1;
    }
}