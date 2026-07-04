class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(c>=0&&r<matrix.length){
            if(target>matrix[r][c])r++;
            else if(target<matrix[r][c])c--;
            else return true;
        }
        return false;
        
    }
}