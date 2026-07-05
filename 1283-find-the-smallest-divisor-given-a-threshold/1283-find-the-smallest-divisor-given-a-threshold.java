class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int start = 1;
        int end = 0;
        for(int num:nums){
            end = Math.max(end,num);
        }
        if(t==nums.length)return end;
        while(start<=end){
            int mid = start + (end-start)/2;
            int total = countSum(nums,mid);
            if(total > t)start = mid +1;
            else if (total<= t)end = mid-1;
        }

        return start;
    }
    public int countSum(int [] nums,int k){
        int divSum = 0;
        for(int num:nums){
            divSum += (num +k-1)/k;
        }
        return divSum;
    }
}