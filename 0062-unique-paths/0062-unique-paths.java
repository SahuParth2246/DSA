class Solution {
    public int uniquePaths(int m, int n) {
        int [][] memo  = new int [m][n];
        for(int[] row : memo) Arrays.fill(row, -1);
        return count( 0,0,m,n,memo);
        

        
    }
    public int count (int r ,int c,int m , int n,int [][] memo){
        if(memo[r][c]!=-1)return memo[r][c];
        if(r==m-1||c==n-1)return 1;
        
        int right = count (r,c+1 , m , n,memo);
        int down = count (r+1 , c ,m , n,memo);
        memo [r][c] = right+down;
        return  memo [r][c] ;
        
    }
}
