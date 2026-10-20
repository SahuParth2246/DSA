class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, pac, i, 0, -1);       
            dfs(heights, atl, i, n - 1, -1);   
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, pac, 0, j, -1);       
            dfs(heights, atl, m - 1, j, -1);   
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j])
                    ans.add(Arrays.asList(i, j));
        return ans;
    }

    private void dfs(int[][] h, boolean[][] vis, int i, int j, int prev) {
        if (i < 0 || j < 0 || i >= h.length || j >= h[0].length
                || vis[i][j] || h[i][j] < prev) return;
        vis[i][j] = true;
        dfs(h, vis, i + 1, j, h[i][j]);
        dfs(h, vis, i - 1, j, h[i][j]);
        dfs(h, vis, i, j + 1, h[i][j]);
        dfs(h, vis, i, j - 1, h[i][j]);
    }
}