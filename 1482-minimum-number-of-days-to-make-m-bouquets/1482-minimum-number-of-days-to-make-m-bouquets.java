class Solution {
    public int minDays(int[] nums, int m, int k) {
        int start =1;
        int end = 0;
        for(int num: nums){
            end = Math.max(end,num);
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            int n = findBoquet(nums,mid,k);
            if(n<m)start = mid+1;
            else if(n>=m)end = mid-1;
        }
        if ((long) m * k > nums.length) return -1;
        return start;
        
    }
    public int findBoquet(int [] nums,int days,int k){
        int consecutive = 0;
        int bouquets = 0;
        for (int num:nums){
            if (num<=days) consecutive++;
            else consecutive = 0;
            if (consecutive == k) {
                bouquets++;
                consecutive = 0;

            }

        }
        return bouquets;
           
    }
}