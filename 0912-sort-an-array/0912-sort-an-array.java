class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        merge(nums,start,end);
        return nums;
    }
    public void merge(int [] nums , int start , int end){
        if(end-start == 0)return;
        int mid = start + (end-start)/2;
        merge(nums,start,mid);
        merge(nums,mid+1,end);
        merged(nums,start,mid ,end);
    }
    public void merged(int [] nums, int start , int mid ,int end){
        int [] mix = new int [end-start+1];
        int i = start,j = mid+1,index=0;
        while(i<=mid&&j<=end){
            if(nums[i]<nums[j])mix[index++]=nums[i++];
            else mix[index++]=nums[j++];
        }
        while(i <=mid)mix[index++]=nums[i++];
        while(j<=end)mix[index++]=nums[j++];

        for(int k = 0;k<mix.length;k++){
            nums[start+k]=mix[k];
        }
        
    }
}