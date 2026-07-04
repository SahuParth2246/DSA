class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int start = 1;
        int end = 0;
        for(int num: nums){
            end = Math.max(end,num);
        }
        
         while(start < end){
            int k = start + (end-start)/2;
            if(findHours(nums,k) <= h) end = k;
            else start = k+1;
        }
        return start;
    }
    public int findHours(int [] nums,int k){
        int hours = 0;
        for(int num:nums){
            if(num<=k){
                hours++;
            }else{
                hours += (num + k - 1) / k;
            }
        }

        return hours;
    }
}