class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int k = 0; k < 4; k++) {
            if (compare(mat, target))
                return true;
            rotate(mat);
        }
        return false;

        
    }
    public boolean compare(int[][] mat, int[][] target){
        for(int i = 0;i<mat.length;i++){
            for(int j = 0; j<mat.length;j++){
                if(!(mat[i][j]==target[i][j]))return false;
                   
            }
        }
        return true;
    }
    public int [][] rotate (int [][] mat){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
        return mat;
    }
}