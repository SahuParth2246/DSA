class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    max = Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i, int j){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return 0;
        }
        int now = grid[i][j];
        grid[i][j] = 0;
        int up = dfs(grid,i-1,j);
        int down = dfs(grid,i+1,j);
        int left = dfs(grid,i,j-1);
        int right = dfs(grid,i,j+1);
        return now + up + down + left + right;
    }
}