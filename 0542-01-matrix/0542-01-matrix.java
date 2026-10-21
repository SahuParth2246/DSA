class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][]dist = new int [m][n];
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0){
                    dist[i][j]=0;
                    q.offer(new int [] {i,j});
                }else{
                    dist[i][j]=-1;
                }
            }
        }
        int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int [] curr = q.poll();
            for(int [] d :dirs ){
                int r = curr[0]+d[0];
                int c = curr[1]+d[1];
                if (r < 0 || c < 0 || r >= m || c >= n || dist[r][c] != -1) continue;
                dist[r][c]=dist[curr[0]][curr[1]]+1;
                q.offer(new int []{r,c});
            }
        }
        return dist ;
    }
}