class Solution {
    public int shipWithinDays(int[] nums, int d) {
        int start = nums[0];
        int end = 0;
        for(int num:nums){
            start=Math.max(start,num);
            end += num;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            int days = countDays(nums,mid);
            if(days>d)start = mid +1;
            else if (days<=d)end = mid-1;
        
        }
        return start;
    }
    public int countDays(int [] nums,int capacity){
        int count = 1;
        int sum = 0;
        for(int num:nums){
            sum+=num;
            if(sum>capacity){
                count++;
                sum=num;
            }
        }
        return count;

    }
}