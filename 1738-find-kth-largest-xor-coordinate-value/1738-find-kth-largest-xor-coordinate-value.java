class Solution {
    public int kthLargestValue(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int [][] xor = new int [rows+1][cols+1];
        for(int i =1;i<=rows;i++){
            for(int j =1;j<=cols;j++){
                xor[i][j]=mat[i-1][j-1]^xor[i-1][j]^xor[i][j-1]^xor[i-1][j-1];
            }
        }
        int [] ans = new int[rows*cols];
        int index=0;
        for(int i =1;i<=rows;i++){
            for(int j =1;j<=cols;j++){
                ans[index]=xor[i][j];
                index++;
            }
        }
        Arrays.sort(ans);
        return ans[ans.length-k];
    }
}