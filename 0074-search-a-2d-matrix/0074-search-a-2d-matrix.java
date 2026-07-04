class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int start = 0;
        int end = m*n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int value = arr[mid/n][mid%n];
            if(value>target)end = mid-1;
            else if(value<target)start = mid+1;
            else return true;
        }
        return false;
        

       
        
    }
   
}