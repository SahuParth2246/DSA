class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int max = 0;
        int size [] = new int [n*n+2];
        int id = 2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    size[id]=dfs(grid,i,j,id);
                    id++;
                }
            }
        }
        boolean hasZero = false;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] != 0) continue;
                hasZero = true;

                Set<Integer> seen = new HashSet<>();
                int total = 1;                      
                int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr < 0 || nc < 0 || nr >= n || nc >= n) continue;
                    id = grid[nr][nc];
                    if (id > 1 && seen.add(id))      
                        total += size[id];
                }
                max = Math.max(max, total);
            }
        }
        return hasZero ? max : n * n;
                
    }
    public int dfs(int[][] grid,int i, int j,int id){
        int n = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j] != 1) return 0;
        grid[i][j] = id;
        int up = dfs(grid,i-1,j,id);
        int down = dfs(grid,i+1,j,id);
        int left = dfs(grid,i,j-1,id);
        int right = dfs(grid,i,j+1,id);
        return 1 + up + down + left + right;
    }
}