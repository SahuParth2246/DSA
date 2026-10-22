class Solution {
    int[][][] memo;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new int[m][n][k];
        for(int[][] a : memo) for(int[] b : a) Arrays.fill(b,-1);
        return dfs(grid,0,0,0,k);
    }

    public int dfs(int[][] grid,int i,int j,int sum,int k){
        if(j>=grid[0].length||i>=grid.length)return 0;
        sum = (sum + grid[i][j]) % k;
        if(i==grid.length-1&&j==grid[0].length-1){
            return sum==0?1:0;
        }
        if(memo[i][j][sum]!=-1)return memo[i][j][sum];
        int right = dfs(grid,i,j+1,sum,k);
        int down = dfs(grid,i+1,j,sum,k);
        return memo[i][j][sum] = (right+down)%1000000007;
    }
}