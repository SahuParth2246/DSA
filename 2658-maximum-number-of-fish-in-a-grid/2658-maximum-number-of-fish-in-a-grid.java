class Solution {
    public int findMaxFish(int[][] grid) {
        int m  = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0)continue;
                else{
                    int ans = dfs(grid,i,j);
                    max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
    public int dfs(int[][]grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)return 0;
        if(grid[i][j]==0)return 0;
        int val = grid[i][j];
        grid[i][j]=0;
        int top = dfs(grid,i-1,j);
        int bottom = dfs(grid,i+1,j);
        int left = dfs(grid,i,j-1);
        int right = dfs(grid,i,j+1);
        return val +top + bottom+right+left;
    }
}