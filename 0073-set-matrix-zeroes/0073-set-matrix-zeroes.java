class Solution {
    public void setZeroes(int[][] matrix) {
        Deque <Integer> stack = new ArrayDeque<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    stack.push(i);
                    stack.push(j);
                }
            }
        }
        while(!stack.isEmpty()){
            int col = stack.pop();
            int row = stack.pop();
            zero(matrix,row,col);
        }

        
    }
    public void zero (int [][] matrix , int row,int col){
        for(int i = 0;i<matrix.length;i++){
            matrix [i][col]=0;
        }
        for(int j = 0; j<matrix[0].length;j++){
            matrix[row][j]=0;
        }
    }
}