class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<mat.length){
            sum += mat[i][j];
            i++;
            j++;
        }
        int row = 0;
        int col = mat.length-1;
        while(row<mat.length){
            if(row==col){
                row++;
                col--;
                continue;
            }

            sum = sum + mat[row][col];
            row++;
            col--;
        }
        return sum;
        
    }
}