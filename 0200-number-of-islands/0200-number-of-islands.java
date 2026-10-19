class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int count = 0;
        for(int i = 0 ; i<m;i++){
            for(int j = 0; j<n; j++){
                if(visited[i][j]||grid[i][j]=='0')continue;
                else {
                    dfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count ;
    }
    public void dfs( char [][] grid , boolean [][] visited , int i ,int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] == '0' || visited[i][j]) return;  
        visited[i][j]=true;
        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i,j-1);
        return ;
    }
}