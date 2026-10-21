class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int minutes = 0;

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();                 
            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                for (int[] d : dirs) {
                    int r = cur[0] + d[0], c = cur[1] + d[1];
                    if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] != 1) continue;
                    grid[r][c] = 2;              
                    fresh--;
                    q.offer(new int[]{r, c});
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}