class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int [][] ans = new int [rows][cols];
        int [][] prefix = new int [rows+1][cols+1];
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=cols;j++){
                prefix[i][j]=mat[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j<=cols;j++){
                int r1 = i-k;
                int r2 = i+k;
                int c1 = j-k;
                int c2 = j+k;
                if(r1<1)r1=1;
                if(c1<1)c1=1;
                if(r2>rows)r2=rows;
                if(c2>cols)c2=cols;
                ans[i-1][j-1]= prefix[r2][c2]-prefix[r1-1][c2]-prefix[r2][c1-1]+prefix[r1-1][c1-1];
            }
        }
        return ans;
    }
}