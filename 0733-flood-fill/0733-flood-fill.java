class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int given = image[sr][sc];
        if (given == color) return image; 
        dfs(image,given,color,sr,sc);
        return image;
    }
    public void dfs (int [][] image , int given ,int color ,int i, int j){
        if(i<0||j<0||i>=image.length||j>=image[0].length)return ;
        if(image[i][j]!=given)return;
        image[i][j]=color;
        dfs(image,given,color,i+1,j);
        dfs(image,given,color,i,j+1);
        dfs(image,given,color,i-1,j);
        dfs(image,given,color,i,j-1);
        return;
    }
}