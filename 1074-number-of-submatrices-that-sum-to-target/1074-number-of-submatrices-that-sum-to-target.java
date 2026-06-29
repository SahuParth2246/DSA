class Solution {
    public int numSubmatrixSumTarget(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;
        int [][] prefix = new int [rows+1][cols+1];
        for(int i = 1;i<=rows;i++){
            for(int j =1;j<=cols;j++){
                prefix[i][j]=mat[i-1][j-1]+ prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }        
        int r1 = 0;
        int r2 = 0;
        int c = 0;
        int sum = 0;
        int count =0;
        HashMap <Integer,Integer> map = new HashMap <>();
        for(r1=1;r1<=rows;r1++){
            for(r2=r1;r2<=rows;r2++){
                map.clear();
                map.put(0,1);
                for(c = 1;c<=cols;c++){
                    sum = prefix[r2][c]-prefix[r1-1][c];
                    count+= map.getOrDefault(sum-target,0);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
                
            }
        }
        return count;
    }
}