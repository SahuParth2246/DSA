class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans [] = new int [n];

        for(int j = 0; j<n;j++){
            int currcol = j;
            boolean isStuck = false;
            for(int i = 0;i<m;i++){
                int direction = grid[i][currcol];
                int nextcol = direction+ currcol;
                if(nextcol<0||nextcol>=n){
                    isStuck = true;
                    break;
                }
                if(grid[i][nextcol]!=direction){
                    isStuck = true;
                    break;
                }
                currcol = nextcol;
            }
            
            if(isStuck){
                ans[j]=-1;
            }
            else ans[j]= currcol;
            
        }
        return ans;
        
    }
}