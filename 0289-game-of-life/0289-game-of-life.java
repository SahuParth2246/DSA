class Solution {
    public void gameOfLife(int[][] matrix) {
        int [] ans = new int [matrix.length*matrix[0].length];
        int index = 0;
        int[] dr = {-1,-1,-1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1,-1, 1,-1, 0, 1};
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                

                int count = 0;
                for(int d = 0; d < 8; d++){
                    int nr = i + dr[d];
                    int nc = j + dc[d];
                    if(nr>=0 && nr<matrix.length && nc>=0 && nc<matrix[0].length){
                        if(matrix[nr][nc] == 1) count++;
                    }
                }
                ans[index]=count;
                index++;
            }
        }
        index = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    if(ans[index] <2)matrix[i][j]=0;
                    else if (ans[index]==2||ans[index]==3)matrix[i][j]=1;
                    else matrix[i][j]=0;
                }else{
                    if(ans[index]==3)matrix[i][j]=1;
                }
                index++;
            }

        }

        
    }
}